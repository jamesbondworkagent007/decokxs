package org.jsoup.parser;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ibm.icu.text.DateFormat;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.p2p.api.OtcRouteConst;
import com.okinc.unify_trade.biz.BotWebHook;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import java.util.Iterator;
import o.AbstractC59916zrY;
import o.AbstractC59954zsj;
import o.C59910zrS;
import o.C59911zrT;
import o.C59913zrV;
import o.C59945zsa;
import o.C59946zsb;
import o.C59949zse;
import o.C59951zsg;
import org.jsoup.helper.DescendableLinkedList;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Token;

/* JADX INFO: loaded from: classes20.dex */
public enum HtmlTreeBuilderState {
    Initial { // from class: org.jsoup.parser.HtmlTreeBuilderState.1
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C59951zsg c59951zsg) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                return true;
            }
            if (token.AhwBna()) {
                c59951zsg.OLrzqt(token.EZpvd());
            } else if (token.AYXKKw()) {
                Token.StateListAnimator stateListAnimatorKWHzl = token.KWHzl();
                c59951zsg.valueOf().KWHzl(new C59945zsa(stateListAnimatorKWHzl.values(), stateListAnimatorKWHzl.fetchVPNInfo(), stateListAnimatorKWHzl.isConnected(), c59951zsg.AYXKKw()));
                if (stateListAnimatorKWHzl.fIwbmz()) {
                    c59951zsg.valueOf().KWHzl(Document.QuirksMode.quirks);
                }
                c59951zsg.OLrzqt(HtmlTreeBuilderState.BeforeHtml);
            } else {
                c59951zsg.OLrzqt(HtmlTreeBuilderState.BeforeHtml);
                return c59951zsg.OLrzqt(token);
            }
            return true;
        }
    },
    BeforeHtml { // from class: org.jsoup.parser.HtmlTreeBuilderState.2
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C59951zsg c59951zsg) {
            if (token.AYXKKw()) {
                c59951zsg.KWHzl(this);
                return false;
            }
            if (!token.AhwBna()) {
                if (HtmlTreeBuilderState.isWhitespace(token)) {
                    return true;
                }
                if (token.AkhnZx() && token.OLrzqt().AuCTel().equals("html")) {
                    c59951zsg.copydefault(token.OLrzqt());
                    c59951zsg.OLrzqt(HtmlTreeBuilderState.BeforeHead);
                } else {
                    if (token.valueOf() && C59910zrS.AEQbTJ(token.AEQbTJ().AuCTel(), TtmlNode.TAG_HEAD, "body", "html", TtmlNode.TAG_BR)) {
                        return anythingElse(token, c59951zsg);
                    }
                    if (token.valueOf()) {
                        c59951zsg.KWHzl(this);
                        return false;
                    }
                    return anythingElse(token, c59951zsg);
                }
            } else {
                c59951zsg.OLrzqt(token.EZpvd());
            }
            return true;
        }

        private boolean anythingElse(Token token, C59951zsg c59951zsg) {
            c59951zsg.djBIcL("html");
            c59951zsg.OLrzqt(HtmlTreeBuilderState.BeforeHead);
            return c59951zsg.OLrzqt(token);
        }
    },
    BeforeHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.3
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C59951zsg c59951zsg) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                return true;
            }
            if (token.AhwBna()) {
                c59951zsg.OLrzqt(token.EZpvd());
            } else {
                if (token.AYXKKw()) {
                    c59951zsg.KWHzl(this);
                    return false;
                }
                if (token.AkhnZx() && token.OLrzqt().AuCTel().equals("html")) {
                    return HtmlTreeBuilderState.InBody.process(token, c59951zsg);
                }
                if (token.AkhnZx() && token.OLrzqt().AuCTel().equals(TtmlNode.TAG_HEAD)) {
                    c59951zsg.DbNXlk(c59951zsg.copydefault(token.OLrzqt()));
                    c59951zsg.OLrzqt(HtmlTreeBuilderState.InHead);
                } else {
                    if (token.valueOf() && C59910zrS.AEQbTJ(token.AEQbTJ().AuCTel(), TtmlNode.TAG_HEAD, "body", "html", TtmlNode.TAG_BR)) {
                        c59951zsg.OLrzqt(new Token.Dialog(TtmlNode.TAG_HEAD));
                        return c59951zsg.OLrzqt(token);
                    }
                    if (token.valueOf()) {
                        c59951zsg.KWHzl(this);
                        return false;
                    }
                    c59951zsg.OLrzqt(new Token.Dialog(TtmlNode.TAG_HEAD));
                    return c59951zsg.OLrzqt(token);
                }
            }
            return true;
        }
    },
    InHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.4
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C59951zsg c59951zsg) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                c59951zsg.AEQbTJ(token.copydefault());
                return true;
            }
            int i = AnonymousClass24.OLrzqt[token.copydefault.ordinal()];
            if (i == 1) {
                c59951zsg.OLrzqt(token.EZpvd());
            } else {
                if (i == 2) {
                    c59951zsg.KWHzl(this);
                    return false;
                }
                if (i == 3) {
                    Token.Dialog dialogOLrzqt = token.OLrzqt();
                    String strAuCTel = dialogOLrzqt.AuCTel();
                    if (strAuCTel.equals("html")) {
                        return HtmlTreeBuilderState.InBody.process(token, c59951zsg);
                    }
                    if (C59910zrS.AEQbTJ(strAuCTel, TtmlNode.RUBY_BASE, "basefont", "bgsound", "command", "link")) {
                        C59946zsb c59946zsbKWHzl = c59951zsg.KWHzl(dialogOLrzqt);
                        if (strAuCTel.equals(TtmlNode.RUBY_BASE) && c59946zsbKWHzl.KWHzl("href")) {
                            c59951zsg.EZpvd(c59946zsbKWHzl);
                        }
                    } else if (strAuCTel.equals("meta")) {
                        c59951zsg.KWHzl(dialogOLrzqt);
                    } else if (strAuCTel.equals("title")) {
                        HtmlTreeBuilderState.handleRcData(dialogOLrzqt, c59951zsg);
                    } else if (C59910zrS.AEQbTJ(strAuCTel, "noframes", TtmlNode.TAG_STYLE)) {
                        HtmlTreeBuilderState.handleRawtext(dialogOLrzqt, c59951zsg);
                    } else if (strAuCTel.equals("noscript")) {
                        c59951zsg.copydefault(dialogOLrzqt);
                        c59951zsg.OLrzqt(HtmlTreeBuilderState.InHeadNoscript);
                    } else if (strAuCTel.equals("script")) {
                        c59951zsg.copydefault(dialogOLrzqt);
                        c59951zsg.ejfBZ.KWHzl(TokeniserState.ScriptData);
                        c59951zsg.fARcdN();
                        c59951zsg.OLrzqt(HtmlTreeBuilderState.Text);
                    } else {
                        if (strAuCTel.equals(TtmlNode.TAG_HEAD)) {
                            c59951zsg.KWHzl(this);
                            return false;
                        }
                        return anythingElse(token, c59951zsg);
                    }
                } else if (i == 4) {
                    String strAuCTel2 = token.AEQbTJ().AuCTel();
                    if (strAuCTel2.equals(TtmlNode.TAG_HEAD)) {
                        c59951zsg.fIwbmz();
                        c59951zsg.OLrzqt(HtmlTreeBuilderState.AfterHead);
                    } else {
                        if (C59910zrS.AEQbTJ(strAuCTel2, "body", "html", TtmlNode.TAG_BR)) {
                            return anythingElse(token, c59951zsg);
                        }
                        c59951zsg.KWHzl(this);
                        return false;
                    }
                } else {
                    return anythingElse(token, c59951zsg);
                }
            }
            return true;
        }

        private boolean anythingElse(Token token, AbstractC59954zsj abstractC59954zsj) {
            abstractC59954zsj.OLrzqt(new Token.Application(TtmlNode.TAG_HEAD));
            return abstractC59954zsj.OLrzqt(token);
        }
    },
    InHeadNoscript { // from class: org.jsoup.parser.HtmlTreeBuilderState.5
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C59951zsg c59951zsg) {
            if (token.AYXKKw()) {
                c59951zsg.KWHzl(this);
                return true;
            }
            if (token.AkhnZx() && token.OLrzqt().AuCTel().equals("html")) {
                return c59951zsg.EZpvd(token, HtmlTreeBuilderState.InBody);
            }
            if (!token.valueOf() || !token.AEQbTJ().AuCTel().equals("noscript")) {
                if (HtmlTreeBuilderState.isWhitespace(token) || token.AhwBna() || (token.AkhnZx() && C59910zrS.AEQbTJ(token.OLrzqt().AuCTel(), "basefont", "bgsound", "link", "meta", "noframes", TtmlNode.TAG_STYLE))) {
                    return c59951zsg.EZpvd(token, HtmlTreeBuilderState.InHead);
                }
                if (token.valueOf() && token.AEQbTJ().AuCTel().equals(TtmlNode.TAG_BR)) {
                    return anythingElse(token, c59951zsg);
                }
                if ((token.AkhnZx() && C59910zrS.AEQbTJ(token.OLrzqt().AuCTel(), TtmlNode.TAG_HEAD, "noscript")) || token.valueOf()) {
                    c59951zsg.KWHzl(this);
                    return false;
                }
                return anythingElse(token, c59951zsg);
            }
            c59951zsg.fIwbmz();
            c59951zsg.OLrzqt(HtmlTreeBuilderState.InHead);
            return true;
        }

        private boolean anythingElse(Token token, C59951zsg c59951zsg) {
            c59951zsg.KWHzl(this);
            c59951zsg.OLrzqt(new Token.Application("noscript"));
            return c59951zsg.OLrzqt(token);
        }
    },
    AfterHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.6
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C59951zsg c59951zsg) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                c59951zsg.AEQbTJ(token.copydefault());
                return true;
            }
            if (token.AhwBna()) {
                c59951zsg.OLrzqt(token.EZpvd());
                return true;
            }
            if (token.AYXKKw()) {
                c59951zsg.KWHzl(this);
                return true;
            }
            if (token.AkhnZx()) {
                Token.Dialog dialogOLrzqt = token.OLrzqt();
                String strAuCTel = dialogOLrzqt.AuCTel();
                if (strAuCTel.equals("html")) {
                    return c59951zsg.EZpvd(token, HtmlTreeBuilderState.InBody);
                }
                if (strAuCTel.equals("body")) {
                    c59951zsg.copydefault(dialogOLrzqt);
                    c59951zsg.EZpvd(false);
                    c59951zsg.OLrzqt(HtmlTreeBuilderState.InBody);
                    return true;
                }
                if (strAuCTel.equals("frameset")) {
                    c59951zsg.copydefault(dialogOLrzqt);
                    c59951zsg.OLrzqt(HtmlTreeBuilderState.InFrameset);
                    return true;
                }
                if (C59910zrS.AEQbTJ(strAuCTel, TtmlNode.RUBY_BASE, "basefont", "bgsound", "link", "meta", "noframes", "script", TtmlNode.TAG_STYLE, "title")) {
                    c59951zsg.KWHzl(this);
                    C59946zsb c59946zsbDjBIcL = c59951zsg.djBIcL();
                    c59951zsg.AYXKKw(c59946zsbDjBIcL);
                    c59951zsg.EZpvd(token, HtmlTreeBuilderState.InHead);
                    c59951zsg.djBIcL(c59946zsbDjBIcL);
                    return true;
                }
                if (strAuCTel.equals(TtmlNode.TAG_HEAD)) {
                    c59951zsg.KWHzl(this);
                    return false;
                }
                anythingElse(token, c59951zsg);
                return true;
            }
            if (token.valueOf()) {
                if (C59910zrS.AEQbTJ(token.AEQbTJ().AuCTel(), "body", "html")) {
                    anythingElse(token, c59951zsg);
                    return true;
                }
                c59951zsg.KWHzl(this);
                return false;
            }
            anythingElse(token, c59951zsg);
            return true;
        }

        private boolean anythingElse(Token token, C59951zsg c59951zsg) {
            c59951zsg.OLrzqt(new Token.Dialog("body"));
            c59951zsg.EZpvd(true);
            return c59951zsg.OLrzqt(token);
        }
    },
    InBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.7
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:451:0x02f4 */
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C59951zsg c59951zsg) {
            C59946zsb c59946zsb;
            int i = AnonymousClass24.OLrzqt[token.copydefault.ordinal()];
            boolean z = true;
            if (i == 1) {
                c59951zsg.OLrzqt(token.EZpvd());
                return true;
            }
            if (i == 2) {
                c59951zsg.KWHzl(this);
                return false;
            }
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return true;
                    }
                    Token.Activity activityCopydefault = token.copydefault();
                    if (!activityCopydefault.values().equals(HtmlTreeBuilderState.nullString)) {
                        if (HtmlTreeBuilderState.isWhitespace(activityCopydefault)) {
                            c59951zsg.ejfBZ();
                            c59951zsg.AEQbTJ(activityCopydefault);
                            return true;
                        }
                        c59951zsg.ejfBZ();
                        c59951zsg.AEQbTJ(activityCopydefault);
                        c59951zsg.EZpvd(false);
                        return true;
                    }
                    c59951zsg.KWHzl(this);
                    return false;
                }
                Token.Application applicationAEQbTJ = token.AEQbTJ();
                String strAuCTel = applicationAEQbTJ.AuCTel();
                if (strAuCTel.equals("body")) {
                    if (!c59951zsg.AhwBna("body")) {
                        c59951zsg.KWHzl(this);
                        return false;
                    }
                    c59951zsg.OLrzqt(HtmlTreeBuilderState.AfterBody);
                    return true;
                }
                if (strAuCTel.equals("html")) {
                    if (c59951zsg.OLrzqt(new Token.Application("body"))) {
                        return c59951zsg.OLrzqt(applicationAEQbTJ);
                    }
                    return true;
                }
                if (C59910zrS.AEQbTJ(strAuCTel, WalletSearchRequest.SEARCH_SOURCE_ADDRESS, "article", "aside", "blockquote", "button", TtmlNode.CENTER, "details", "dir", TtmlNode.TAG_DIV, "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", OtcRouteConst.MAIN_ROUTE_NAV, "ol", "pre", "section", "summary", "ul")) {
                    if (!c59951zsg.AhwBna(strAuCTel)) {
                        c59951zsg.KWHzl(this);
                        return false;
                    }
                    c59951zsg.AhwBna();
                    if (!c59951zsg.uzCIH().copydefault().equals(strAuCTel)) {
                        c59951zsg.KWHzl(this);
                    }
                    c59951zsg.DbNXlk(strAuCTel);
                    return true;
                }
                C59946zsb c59946zsb2 = null;
                if (strAuCTel.equals("form")) {
                    C59946zsb c59946zsbGEmmrt = c59951zsg.gEmmrt();
                    c59951zsg.isConnected(null);
                    if (c59946zsbGEmmrt == null || !c59951zsg.AhwBna(strAuCTel)) {
                        c59951zsg.KWHzl(this);
                        return false;
                    }
                    c59951zsg.AhwBna();
                    if (!c59951zsg.uzCIH().copydefault().equals(strAuCTel)) {
                        c59951zsg.KWHzl(this);
                    }
                    c59951zsg.djBIcL(c59946zsbGEmmrt);
                    return true;
                }
                if (strAuCTel.equals(TtmlNode.TAG_P)) {
                    if (!c59951zsg.KWHzl(strAuCTel)) {
                        c59951zsg.KWHzl(this);
                        c59951zsg.OLrzqt(new Token.Dialog(strAuCTel));
                        return c59951zsg.OLrzqt(applicationAEQbTJ);
                    }
                    c59951zsg.OLrzqt(strAuCTel);
                    if (!c59951zsg.uzCIH().copydefault().equals(strAuCTel)) {
                        c59951zsg.KWHzl(this);
                    }
                    c59951zsg.DbNXlk(strAuCTel);
                    return true;
                }
                if (strAuCTel.equals("li")) {
                    if (!c59951zsg.AEQbTJ(strAuCTel)) {
                        c59951zsg.KWHzl(this);
                        return false;
                    }
                    c59951zsg.OLrzqt(strAuCTel);
                    if (!c59951zsg.uzCIH().copydefault().equals(strAuCTel)) {
                        c59951zsg.KWHzl(this);
                    }
                    c59951zsg.DbNXlk(strAuCTel);
                    return true;
                }
                if (C59910zrS.AEQbTJ(strAuCTel, "dd", "dt")) {
                    if (!c59951zsg.AhwBna(strAuCTel)) {
                        c59951zsg.KWHzl(this);
                        return false;
                    }
                    c59951zsg.OLrzqt(strAuCTel);
                    if (!c59951zsg.uzCIH().copydefault().equals(strAuCTel)) {
                        c59951zsg.KWHzl(this);
                    }
                    c59951zsg.DbNXlk(strAuCTel);
                    return true;
                }
                if (C59910zrS.AEQbTJ(strAuCTel, "h1", "h2", "h3", "h4", "h5", "h6")) {
                    if (!c59951zsg.KWHzl(new String[]{"h1", "h2", "h3", "h4", "h5", "h6"})) {
                        c59951zsg.KWHzl(this);
                        return false;
                    }
                    c59951zsg.OLrzqt(strAuCTel);
                    if (!c59951zsg.uzCIH().copydefault().equals(strAuCTel)) {
                        c59951zsg.KWHzl(this);
                    }
                    c59951zsg.OLrzqt("h1", "h2", "h3", "h4", "h5", "h6");
                    return true;
                }
                if (strAuCTel.equals("sarcasm")) {
                    return anyOtherEndTag(token, c59951zsg);
                }
                if (!C59910zrS.AEQbTJ(strAuCTel, IEncryptorType.DEFAULT_ENCRYPTOR, "b", "big", "code", "em", "font", "i", "nobr", DateFormat.SECOND, "small", "strike", "strong", TtmlNode.TAG_TT, "u")) {
                    if (C59910zrS.AEQbTJ(strAuCTel, "applet", "marquee", "object")) {
                        if (c59951zsg.AhwBna("name")) {
                            return true;
                        }
                        if (!c59951zsg.AhwBna(strAuCTel)) {
                            c59951zsg.KWHzl(this);
                            return false;
                        }
                        c59951zsg.AhwBna();
                        if (!c59951zsg.uzCIH().copydefault().equals(strAuCTel)) {
                            c59951zsg.KWHzl(this);
                        }
                        c59951zsg.DbNXlk(strAuCTel);
                        c59951zsg.EZpvd();
                        return true;
                    }
                    if (strAuCTel.equals(TtmlNode.TAG_BR)) {
                        c59951zsg.KWHzl(this);
                        c59951zsg.OLrzqt(new Token.Dialog(TtmlNode.TAG_BR));
                        return false;
                    }
                    return anyOtherEndTag(token, c59951zsg);
                }
                int i2 = 0;
                while (i2 < 8) {
                    C59946zsb c59946zsbEZpvd = c59951zsg.EZpvd(strAuCTel);
                    if (c59946zsbEZpvd == null) {
                        return anyOtherEndTag(token, c59951zsg);
                    }
                    if (!c59951zsg.AhwBna(c59946zsbEZpvd)) {
                        c59951zsg.KWHzl(this);
                        c59951zsg.gEmmrt(c59946zsbEZpvd);
                        return z;
                    }
                    if (!c59951zsg.AhwBna(c59946zsbEZpvd.copydefault())) {
                        c59951zsg.KWHzl(this);
                        return false;
                    }
                    if (c59951zsg.uzCIH() != c59946zsbEZpvd) {
                        c59951zsg.KWHzl(this);
                    }
                    DescendableLinkedList<C59946zsb> descendableLinkedListIsConnected = c59951zsg.isConnected();
                    boolean z2 = false;
                    C59946zsb c59946zsb3 = c59946zsb2;
                    for (int i3 = 0; i3 < descendableLinkedListIsConnected.size() && i3 < 64; i3++) {
                        c59946zsb = descendableLinkedListIsConnected.get(i3);
                        if (c59946zsb == c59946zsbEZpvd) {
                            c59946zsb3 = descendableLinkedListIsConnected.get(i3 - 1);
                            z2 = z;
                        } else if (z2 && c59951zsg.AEQbTJ(c59946zsb)) {
                            break;
                        }
                    }
                    c59946zsb = c59946zsb2;
                    if (c59946zsb == null) {
                        c59951zsg.DbNXlk(c59946zsbEZpvd.copydefault());
                        c59951zsg.gEmmrt(c59946zsbEZpvd);
                        return z;
                    }
                    int i4 = 0;
                    C59946zsb c59946zsbCopydefault = c59946zsb;
                    AbstractC59916zrY abstractC59916zrY = c59946zsbCopydefault;
                    for (int i5 = 3; i4 < i5; i5 = 3) {
                        if (c59951zsg.AhwBna(c59946zsbCopydefault)) {
                            c59946zsbCopydefault = c59951zsg.copydefault(c59946zsbCopydefault);
                        }
                        if (!c59951zsg.OLrzqt(c59946zsbCopydefault)) {
                            c59951zsg.djBIcL(c59946zsbCopydefault);
                        } else {
                            if (c59946zsbCopydefault == c59946zsbEZpvd) {
                                break;
                            }
                            C59946zsb c59946zsb4 = new C59946zsb(C59949zse.EZpvd(c59946zsbCopydefault.copydefault()), c59951zsg.AYXKKw());
                            c59951zsg.copydefault(c59946zsbCopydefault, c59946zsb4);
                            c59951zsg.AEQbTJ(c59946zsbCopydefault, c59946zsb4);
                            if (abstractC59916zrY.AhwBna() != null) {
                                abstractC59916zrY.uzCIH();
                            }
                            c59946zsb4.KWHzl(abstractC59916zrY);
                            c59946zsbCopydefault = c59946zsb4;
                            abstractC59916zrY = c59946zsbCopydefault;
                        }
                        i4++;
                    }
                    if (C59910zrS.AEQbTJ(c59946zsb3.copydefault(), "table", "tbody", "tfoot", "thead", "tr")) {
                        if (abstractC59916zrY.AhwBna() != null) {
                            abstractC59916zrY.uzCIH();
                        }
                        c59951zsg.copydefault(abstractC59916zrY);
                    } else {
                        if (abstractC59916zrY.AhwBna() != null) {
                            abstractC59916zrY.uzCIH();
                        }
                        c59946zsb3.KWHzl(abstractC59916zrY);
                    }
                    C59946zsb c59946zsb5 = new C59946zsb(C59949zse.EZpvd(strAuCTel), c59951zsg.AYXKKw());
                    for (AbstractC59916zrY abstractC59916zrY2 : (AbstractC59916zrY[]) c59946zsb.fARcdN().toArray(new AbstractC59916zrY[c59946zsb.AkhnZx()])) {
                        c59946zsb5.KWHzl(abstractC59916zrY2);
                    }
                    c59946zsb.KWHzl(c59946zsb5);
                    c59951zsg.gEmmrt(c59946zsbEZpvd);
                    c59951zsg.djBIcL(c59946zsbEZpvd);
                    c59951zsg.OLrzqt(c59946zsb, c59946zsb5);
                    i2++;
                    z = true;
                    c59946zsb2 = null;
                }
                return true;
            }
            Token.Dialog dialogOLrzqt = token.OLrzqt();
            String strAuCTel2 = dialogOLrzqt.AuCTel();
            if (strAuCTel2.equals("html")) {
                c59951zsg.KWHzl(this);
                C59946zsb first = c59951zsg.isConnected().getFirst();
                for (C59911zrT c59911zrT : dialogOLrzqt.isConnected()) {
                    if (!first.KWHzl(c59911zrT.getKey())) {
                        first.DbNXlk().EZpvd(c59911zrT);
                    }
                }
                return true;
            }
            if (C59910zrS.AEQbTJ(strAuCTel2, TtmlNode.RUBY_BASE, "basefont", "bgsound", "command", "link", "meta", "noframes", "script", TtmlNode.TAG_STYLE, "title")) {
                return c59951zsg.EZpvd(token, HtmlTreeBuilderState.InHead);
            }
            if (strAuCTel2.equals("body")) {
                c59951zsg.KWHzl(this);
                DescendableLinkedList<C59946zsb> descendableLinkedListIsConnected2 = c59951zsg.isConnected();
                if (descendableLinkedListIsConnected2.size() == 1 || (descendableLinkedListIsConnected2.size() > 2 && !descendableLinkedListIsConnected2.get(1).copydefault().equals("body"))) {
                    return false;
                }
                c59951zsg.EZpvd(false);
                C59946zsb c59946zsb6 = descendableLinkedListIsConnected2.get(1);
                for (C59911zrT c59911zrT2 : dialogOLrzqt.isConnected()) {
                    if (!c59946zsb6.KWHzl(c59911zrT2.getKey())) {
                        c59946zsb6.DbNXlk().EZpvd(c59911zrT2);
                    }
                }
                return true;
            }
            if (strAuCTel2.equals("frameset")) {
                c59951zsg.KWHzl(this);
                DescendableLinkedList<C59946zsb> descendableLinkedListIsConnected3 = c59951zsg.isConnected();
                if (descendableLinkedListIsConnected3.size() == 1 || ((descendableLinkedListIsConnected3.size() > 2 && !descendableLinkedListIsConnected3.get(1).copydefault().equals("body")) || !c59951zsg.OLrzqt())) {
                    return false;
                }
                C59946zsb c59946zsb7 = descendableLinkedListIsConnected3.get(1);
                if (c59946zsb7.AhwBna() != null) {
                    c59946zsb7.uzCIH();
                }
                for (int i6 = 1; descendableLinkedListIsConnected3.size() > i6; i6 = 1) {
                    descendableLinkedListIsConnected3.removeLast();
                }
                c59951zsg.copydefault(dialogOLrzqt);
                c59951zsg.OLrzqt(HtmlTreeBuilderState.InFrameset);
                return true;
            }
            if (C59910zrS.AEQbTJ(strAuCTel2, WalletSearchRequest.SEARCH_SOURCE_ADDRESS, "article", "aside", "blockquote", TtmlNode.CENTER, "details", "dir", TtmlNode.TAG_DIV, "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", OtcRouteConst.MAIN_ROUTE_NAV, "ol", TtmlNode.TAG_P, "section", "summary", "ul")) {
                if (c59951zsg.KWHzl(TtmlNode.TAG_P)) {
                    c59951zsg.OLrzqt(new Token.Application(TtmlNode.TAG_P));
                }
                c59951zsg.copydefault(dialogOLrzqt);
                return true;
            }
            if (C59910zrS.AEQbTJ(strAuCTel2, "h1", "h2", "h3", "h4", "h5", "h6")) {
                if (c59951zsg.KWHzl(TtmlNode.TAG_P)) {
                    c59951zsg.OLrzqt(new Token.Application(TtmlNode.TAG_P));
                }
                if (C59910zrS.AEQbTJ(c59951zsg.uzCIH().copydefault(), "h1", "h2", "h3", "h4", "h5", "h6")) {
                    c59951zsg.KWHzl(this);
                    c59951zsg.fIwbmz();
                }
                c59951zsg.copydefault(dialogOLrzqt);
                return true;
            }
            if (C59910zrS.AEQbTJ(strAuCTel2, "pre", "listing")) {
                if (c59951zsg.KWHzl(TtmlNode.TAG_P)) {
                    c59951zsg.OLrzqt(new Token.Application(TtmlNode.TAG_P));
                }
                c59951zsg.copydefault(dialogOLrzqt);
                c59951zsg.EZpvd(false);
                return true;
            }
            if (strAuCTel2.equals("form")) {
                if (c59951zsg.gEmmrt() != null) {
                    c59951zsg.KWHzl(this);
                    return false;
                }
                if (c59951zsg.KWHzl(TtmlNode.TAG_P)) {
                    c59951zsg.OLrzqt(new Token.Application(TtmlNode.TAG_P));
                }
                c59951zsg.isConnected(c59951zsg.copydefault(dialogOLrzqt));
                return true;
            }
            if (strAuCTel2.equals("li")) {
                c59951zsg.EZpvd(false);
                DescendableLinkedList<C59946zsb> descendableLinkedListIsConnected4 = c59951zsg.isConnected();
                int size = descendableLinkedListIsConnected4.size() - 1;
                while (true) {
                    if (size <= 0) {
                        break;
                    }
                    C59946zsb c59946zsb8 = descendableLinkedListIsConnected4.get(size);
                    if (c59946zsb8.copydefault().equals("li")) {
                        c59951zsg.OLrzqt(new Token.Application("li"));
                        break;
                    }
                    if (c59951zsg.AEQbTJ(c59946zsb8) && !C59910zrS.AEQbTJ(c59946zsb8.copydefault(), WalletSearchRequest.SEARCH_SOURCE_ADDRESS, TtmlNode.TAG_DIV, TtmlNode.TAG_P)) {
                        break;
                    }
                    size--;
                }
                if (c59951zsg.KWHzl(TtmlNode.TAG_P)) {
                    c59951zsg.OLrzqt(new Token.Application(TtmlNode.TAG_P));
                }
                c59951zsg.copydefault(dialogOLrzqt);
                return true;
            }
            if (C59910zrS.AEQbTJ(strAuCTel2, "dd", "dt")) {
                c59951zsg.EZpvd(false);
                DescendableLinkedList<C59946zsb> descendableLinkedListIsConnected5 = c59951zsg.isConnected();
                int size2 = descendableLinkedListIsConnected5.size() - 1;
                while (true) {
                    if (size2 <= 0) {
                        break;
                    }
                    C59946zsb c59946zsb9 = descendableLinkedListIsConnected5.get(size2);
                    if (C59910zrS.AEQbTJ(c59946zsb9.copydefault(), "dd", "dt")) {
                        c59951zsg.OLrzqt(new Token.Application(c59946zsb9.copydefault()));
                        break;
                    }
                    if (c59951zsg.AEQbTJ(c59946zsb9) && !C59910zrS.AEQbTJ(c59946zsb9.copydefault(), WalletSearchRequest.SEARCH_SOURCE_ADDRESS, TtmlNode.TAG_DIV, TtmlNode.TAG_P)) {
                        break;
                    }
                    size2--;
                }
                if (c59951zsg.KWHzl(TtmlNode.TAG_P)) {
                    c59951zsg.OLrzqt(new Token.Application(TtmlNode.TAG_P));
                }
                c59951zsg.copydefault(dialogOLrzqt);
                return true;
            }
            if (strAuCTel2.equals("plaintext")) {
                if (c59951zsg.KWHzl(TtmlNode.TAG_P)) {
                    c59951zsg.OLrzqt(new Token.Application(TtmlNode.TAG_P));
                }
                c59951zsg.copydefault(dialogOLrzqt);
                c59951zsg.ejfBZ.KWHzl(TokeniserState.PLAINTEXT);
                return true;
            }
            if (strAuCTel2.equals("button")) {
                if (c59951zsg.KWHzl("button")) {
                    c59951zsg.KWHzl(this);
                    c59951zsg.OLrzqt(new Token.Application("button"));
                    c59951zsg.OLrzqt(dialogOLrzqt);
                    return true;
                }
                c59951zsg.ejfBZ();
                c59951zsg.copydefault(dialogOLrzqt);
                c59951zsg.EZpvd(false);
                return true;
            }
            if (strAuCTel2.equals(IEncryptorType.DEFAULT_ENCRYPTOR)) {
                if (c59951zsg.EZpvd(IEncryptorType.DEFAULT_ENCRYPTOR) != null) {
                    c59951zsg.KWHzl(this);
                    c59951zsg.OLrzqt(new Token.Application(IEncryptorType.DEFAULT_ENCRYPTOR));
                    C59946zsb c59946zsbCopydefault2 = c59951zsg.copydefault(IEncryptorType.DEFAULT_ENCRYPTOR);
                    if (c59946zsbCopydefault2 != null) {
                        c59951zsg.gEmmrt(c59946zsbCopydefault2);
                        c59951zsg.djBIcL(c59946zsbCopydefault2);
                    }
                }
                c59951zsg.ejfBZ();
                c59951zsg.valueOf(c59951zsg.copydefault(dialogOLrzqt));
                return true;
            }
            if (C59910zrS.AEQbTJ(strAuCTel2, "b", "big", "code", "em", "font", "i", DateFormat.SECOND, "small", "strike", "strong", TtmlNode.TAG_TT, "u")) {
                c59951zsg.ejfBZ();
                c59951zsg.valueOf(c59951zsg.copydefault(dialogOLrzqt));
                return true;
            }
            if (strAuCTel2.equals("nobr")) {
                c59951zsg.ejfBZ();
                if (c59951zsg.AhwBna("nobr")) {
                    c59951zsg.KWHzl(this);
                    c59951zsg.OLrzqt(new Token.Application("nobr"));
                    c59951zsg.ejfBZ();
                }
                c59951zsg.valueOf(c59951zsg.copydefault(dialogOLrzqt));
                return true;
            }
            if (C59910zrS.AEQbTJ(strAuCTel2, "applet", "marquee", "object")) {
                c59951zsg.ejfBZ();
                c59951zsg.copydefault(dialogOLrzqt);
                c59951zsg.DbNXlk();
                c59951zsg.EZpvd(false);
                return true;
            }
            if (strAuCTel2.equals("table")) {
                if (c59951zsg.valueOf().AYXKKw() != Document.QuirksMode.quirks && c59951zsg.KWHzl(TtmlNode.TAG_P)) {
                    c59951zsg.OLrzqt(new Token.Application(TtmlNode.TAG_P));
                }
                c59951zsg.copydefault(dialogOLrzqt);
                c59951zsg.EZpvd(false);
                c59951zsg.OLrzqt(HtmlTreeBuilderState.InTable);
                return true;
            }
            if (C59910zrS.AEQbTJ(strAuCTel2, OtcExtraKeys.AREA, TtmlNode.TAG_BR, "embed", "img", "keygen", "wbr")) {
                c59951zsg.ejfBZ();
                c59951zsg.KWHzl(dialogOLrzqt);
                c59951zsg.EZpvd(false);
                return true;
            }
            if (strAuCTel2.equals(Web3SecurityTrackEvent.VALUE_INPUT)) {
                c59951zsg.ejfBZ();
                if (c59951zsg.KWHzl(dialogOLrzqt).EZpvd("type").equalsIgnoreCase("hidden")) {
                    return true;
                }
                c59951zsg.EZpvd(false);
                return true;
            }
            if (C59910zrS.AEQbTJ(strAuCTel2, "param", "source", "track")) {
                c59951zsg.KWHzl(dialogOLrzqt);
                return true;
            }
            if (strAuCTel2.equals("hr")) {
                if (c59951zsg.KWHzl(TtmlNode.TAG_P)) {
                    c59951zsg.OLrzqt(new Token.Application(TtmlNode.TAG_P));
                }
                c59951zsg.KWHzl(dialogOLrzqt);
                c59951zsg.EZpvd(false);
                return true;
            }
            if (strAuCTel2.equals(TtmlNode.TAG_IMAGE)) {
                dialogOLrzqt.AEQbTJ("img");
                return c59951zsg.OLrzqt(dialogOLrzqt);
            }
            if (strAuCTel2.equals("isindex")) {
                c59951zsg.KWHzl(this);
                if (c59951zsg.gEmmrt() != null) {
                    return false;
                }
                c59951zsg.ejfBZ.AEQbTJ();
                c59951zsg.OLrzqt(new Token.Dialog("form"));
                if (dialogOLrzqt.AEQbTJ.KWHzl(BotWebHook.KEY_ACTION)) {
                    c59951zsg.gEmmrt().EZpvd(BotWebHook.KEY_ACTION, dialogOLrzqt.AEQbTJ.copydefault(BotWebHook.KEY_ACTION));
                }
                c59951zsg.OLrzqt(new Token.Dialog("hr"));
                c59951zsg.OLrzqt(new Token.Dialog("label"));
                c59951zsg.OLrzqt(new Token.Activity(dialogOLrzqt.AEQbTJ.KWHzl("prompt") ? dialogOLrzqt.AEQbTJ.copydefault("prompt") : "This is a searchable index. Enter search keywords: "));
                C59913zrV c59913zrV = new C59913zrV();
                for (C59911zrT c59911zrT3 : dialogOLrzqt.AEQbTJ) {
                    if (!C59910zrS.AEQbTJ(c59911zrT3.getKey(), "name", BotWebHook.KEY_ACTION, "prompt")) {
                        c59913zrV.EZpvd(c59911zrT3);
                    }
                }
                c59913zrV.copydefault("name", "isindex");
                c59951zsg.OLrzqt(new Token.Dialog(Web3SecurityTrackEvent.VALUE_INPUT, c59913zrV));
                c59951zsg.OLrzqt(new Token.Application("label"));
                c59951zsg.OLrzqt(new Token.Dialog("hr"));
                c59951zsg.OLrzqt(new Token.Application("form"));
                return true;
            }
            if (strAuCTel2.equals("textarea")) {
                c59951zsg.copydefault(dialogOLrzqt);
                c59951zsg.ejfBZ.KWHzl(TokeniserState.Rcdata);
                c59951zsg.fARcdN();
                c59951zsg.EZpvd(false);
                c59951zsg.OLrzqt(HtmlTreeBuilderState.Text);
                return true;
            }
            if (strAuCTel2.equals("xmp")) {
                if (c59951zsg.KWHzl(TtmlNode.TAG_P)) {
                    c59951zsg.OLrzqt(new Token.Application(TtmlNode.TAG_P));
                }
                c59951zsg.ejfBZ();
                c59951zsg.EZpvd(false);
                HtmlTreeBuilderState.handleRawtext(dialogOLrzqt, c59951zsg);
                return true;
            }
            if (strAuCTel2.equals("iframe")) {
                c59951zsg.EZpvd(false);
                HtmlTreeBuilderState.handleRawtext(dialogOLrzqt, c59951zsg);
                return true;
            }
            if (strAuCTel2.equals("noembed")) {
                HtmlTreeBuilderState.handleRawtext(dialogOLrzqt, c59951zsg);
                return true;
            }
            if (strAuCTel2.equals("select")) {
                c59951zsg.ejfBZ();
                c59951zsg.copydefault(dialogOLrzqt);
                c59951zsg.EZpvd(false);
                HtmlTreeBuilderState newProxyInstance = c59951zsg.getNewProxyInstance();
                if (newProxyInstance.equals(HtmlTreeBuilderState.InTable) || newProxyInstance.equals(HtmlTreeBuilderState.InCaption) || newProxyInstance.equals(HtmlTreeBuilderState.InTableBody) || newProxyInstance.equals(HtmlTreeBuilderState.InRow) || newProxyInstance.equals(HtmlTreeBuilderState.InCell)) {
                    c59951zsg.OLrzqt(HtmlTreeBuilderState.InSelectInTable);
                    return true;
                }
                c59951zsg.OLrzqt(HtmlTreeBuilderState.InSelect);
                return true;
            }
            if (C59910zrS.AEQbTJ("optgroup", "option")) {
                if (c59951zsg.uzCIH().copydefault().equals("option")) {
                    c59951zsg.OLrzqt(new Token.Application("option"));
                }
                c59951zsg.ejfBZ();
                c59951zsg.copydefault(dialogOLrzqt);
                return true;
            }
            if (C59910zrS.AEQbTJ("rp", "rt")) {
                if (!c59951zsg.AhwBna(TtmlNode.ATTR_TTS_RUBY)) {
                    return true;
                }
                c59951zsg.AhwBna();
                if (!c59951zsg.uzCIH().copydefault().equals(TtmlNode.ATTR_TTS_RUBY)) {
                    c59951zsg.KWHzl(this);
                    c59951zsg.AYXKKw(TtmlNode.ATTR_TTS_RUBY);
                }
                c59951zsg.copydefault(dialogOLrzqt);
                return true;
            }
            if (strAuCTel2.equals("math")) {
                c59951zsg.ejfBZ();
                c59951zsg.copydefault(dialogOLrzqt);
                c59951zsg.ejfBZ.AEQbTJ();
                return true;
            }
            if (strAuCTel2.equals("svg")) {
                c59951zsg.ejfBZ();
                c59951zsg.copydefault(dialogOLrzqt);
                c59951zsg.ejfBZ.AEQbTJ();
                return true;
            }
            if (C59910zrS.AEQbTJ(strAuCTel2, "caption", "col", "colgroup", TypedValues.AttributesType.S_FRAME, TtmlNode.TAG_HEAD, "tbody", "td", "tfoot", "th", "thead", "tr")) {
                c59951zsg.KWHzl(this);
                return false;
            }
            c59951zsg.ejfBZ();
            c59951zsg.copydefault(dialogOLrzqt);
            return true;
        }

        public boolean anyOtherEndTag(Token token, C59951zsg c59951zsg) {
            String strAuCTel = token.AEQbTJ().AuCTel();
            Iterator<C59946zsb> itDescendingIterator = c59951zsg.isConnected().descendingIterator();
            while (itDescendingIterator.hasNext()) {
                C59946zsb next = itDescendingIterator.next();
                if (next.copydefault().equals(strAuCTel)) {
                    c59951zsg.OLrzqt(strAuCTel);
                    if (!strAuCTel.equals(c59951zsg.uzCIH().copydefault())) {
                        c59951zsg.KWHzl(this);
                    }
                    c59951zsg.DbNXlk(strAuCTel);
                    return true;
                }
                if (c59951zsg.AEQbTJ(next)) {
                    c59951zsg.KWHzl(this);
                    return false;
                }
            }
            return true;
        }
    },
    Text { // from class: org.jsoup.parser.HtmlTreeBuilderState.8
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C59951zsg c59951zsg) {
            if (token.gEmmrt()) {
                c59951zsg.AEQbTJ(token.copydefault());
                return true;
            }
            if (token.djBIcL()) {
                c59951zsg.KWHzl(this);
                c59951zsg.fIwbmz();
                c59951zsg.OLrzqt(c59951zsg.fJNWhG());
                return c59951zsg.OLrzqt(token);
            }
            if (!token.valueOf()) {
                return true;
            }
            c59951zsg.fIwbmz();
            c59951zsg.OLrzqt(c59951zsg.fJNWhG());
            return true;
        }
    },
    InTable { // from class: org.jsoup.parser.HtmlTreeBuilderState.9
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C59951zsg c59951zsg) {
            if (token.gEmmrt()) {
                c59951zsg.AuCTel();
                c59951zsg.fARcdN();
                c59951zsg.OLrzqt(HtmlTreeBuilderState.InTableText);
                return c59951zsg.OLrzqt(token);
            }
            if (token.AhwBna()) {
                c59951zsg.OLrzqt(token.EZpvd());
                return true;
            }
            if (token.AYXKKw()) {
                c59951zsg.KWHzl(this);
                return false;
            }
            if (token.AkhnZx()) {
                Token.Dialog dialogOLrzqt = token.OLrzqt();
                String strAuCTel = dialogOLrzqt.AuCTel();
                if (strAuCTel.equals("caption")) {
                    c59951zsg.copydefault();
                    c59951zsg.DbNXlk();
                    c59951zsg.copydefault(dialogOLrzqt);
                    c59951zsg.OLrzqt(HtmlTreeBuilderState.InCaption);
                } else if (strAuCTel.equals("colgroup")) {
                    c59951zsg.copydefault();
                    c59951zsg.copydefault(dialogOLrzqt);
                    c59951zsg.OLrzqt(HtmlTreeBuilderState.InColumnGroup);
                } else {
                    if (strAuCTel.equals("col")) {
                        c59951zsg.OLrzqt(new Token.Dialog("colgroup"));
                        return c59951zsg.OLrzqt(token);
                    }
                    if (C59910zrS.AEQbTJ(strAuCTel, "tbody", "tfoot", "thead")) {
                        c59951zsg.copydefault();
                        c59951zsg.copydefault(dialogOLrzqt);
                        c59951zsg.OLrzqt(HtmlTreeBuilderState.InTableBody);
                    } else {
                        if (C59910zrS.AEQbTJ(strAuCTel, "td", "th", "tr")) {
                            c59951zsg.OLrzqt(new Token.Dialog("tbody"));
                            return c59951zsg.OLrzqt(token);
                        }
                        if (strAuCTel.equals("table")) {
                            c59951zsg.KWHzl(this);
                            if (c59951zsg.OLrzqt(new Token.Application("table"))) {
                                return c59951zsg.OLrzqt(token);
                            }
                        } else {
                            if (C59910zrS.AEQbTJ(strAuCTel, TtmlNode.TAG_STYLE, "script")) {
                                return c59951zsg.EZpvd(token, HtmlTreeBuilderState.InHead);
                            }
                            if (strAuCTel.equals(Web3SecurityTrackEvent.VALUE_INPUT)) {
                                if (!dialogOLrzqt.AEQbTJ.copydefault("type").equalsIgnoreCase("hidden")) {
                                    return anythingElse(token, c59951zsg);
                                }
                                c59951zsg.KWHzl(dialogOLrzqt);
                            } else if (strAuCTel.equals("form")) {
                                c59951zsg.KWHzl(this);
                                if (c59951zsg.gEmmrt() != null) {
                                    return false;
                                }
                                c59951zsg.isConnected(c59951zsg.KWHzl(dialogOLrzqt));
                            } else {
                                return anythingElse(token, c59951zsg);
                            }
                        }
                    }
                }
            } else if (token.valueOf()) {
                String strAuCTel2 = token.AEQbTJ().AuCTel();
                if (strAuCTel2.equals("table")) {
                    if (!c59951zsg.gEmmrt(strAuCTel2)) {
                        c59951zsg.KWHzl(this);
                        return false;
                    }
                    c59951zsg.DbNXlk("table");
                    c59951zsg.hDKMBd();
                } else {
                    if (C59910zrS.AEQbTJ(strAuCTel2, "body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr")) {
                        c59951zsg.KWHzl(this);
                        return false;
                    }
                    return anythingElse(token, c59951zsg);
                }
            } else if (token.djBIcL()) {
                if (c59951zsg.uzCIH().copydefault().equals("html")) {
                    c59951zsg.KWHzl(this);
                }
                return true;
            }
            return anythingElse(token, c59951zsg);
        }

        public boolean anythingElse(Token token, C59951zsg c59951zsg) {
            c59951zsg.KWHzl(this);
            if (C59910zrS.AEQbTJ(c59951zsg.uzCIH().copydefault(), "table", "tbody", "tfoot", "thead", "tr")) {
                c59951zsg.copydefault(true);
                boolean zEZpvd = c59951zsg.EZpvd(token, HtmlTreeBuilderState.InBody);
                c59951zsg.copydefault(false);
                return zEZpvd;
            }
            return c59951zsg.EZpvd(token, HtmlTreeBuilderState.InBody);
        }
    },
    InTableText { // from class: org.jsoup.parser.HtmlTreeBuilderState.10
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C59951zsg c59951zsg) {
            if (AnonymousClass24.OLrzqt[token.copydefault.ordinal()] == 5) {
                Token.Activity activityCopydefault = token.copydefault();
                if (activityCopydefault.values().equals(HtmlTreeBuilderState.nullString)) {
                    c59951zsg.KWHzl(this);
                    return false;
                }
                c59951zsg.fetchVPNInfo().add(activityCopydefault);
                return true;
            }
            if (c59951zsg.fetchVPNInfo().size() > 0) {
                for (Token.Activity activity : c59951zsg.fetchVPNInfo()) {
                    if (!HtmlTreeBuilderState.isWhitespace(activity)) {
                        c59951zsg.KWHzl(this);
                        if (C59910zrS.AEQbTJ(c59951zsg.uzCIH().copydefault(), "table", "tbody", "tfoot", "thead", "tr")) {
                            c59951zsg.copydefault(true);
                            c59951zsg.EZpvd(activity, HtmlTreeBuilderState.InBody);
                            c59951zsg.copydefault(false);
                        } else {
                            c59951zsg.EZpvd(activity, HtmlTreeBuilderState.InBody);
                        }
                    } else {
                        c59951zsg.AEQbTJ(activity);
                    }
                }
                c59951zsg.AuCTel();
            }
            c59951zsg.OLrzqt(c59951zsg.fJNWhG());
            return c59951zsg.OLrzqt(token);
        }
    },
    InCaption { // from class: org.jsoup.parser.HtmlTreeBuilderState.11
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C59951zsg c59951zsg) {
            if (token.valueOf() && token.AEQbTJ().AuCTel().equals("caption")) {
                if (!c59951zsg.gEmmrt(token.AEQbTJ().AuCTel())) {
                    c59951zsg.KWHzl(this);
                    return false;
                }
                c59951zsg.AhwBna();
                if (!c59951zsg.uzCIH().copydefault().equals("caption")) {
                    c59951zsg.KWHzl(this);
                }
                c59951zsg.DbNXlk("caption");
                c59951zsg.EZpvd();
                c59951zsg.OLrzqt(HtmlTreeBuilderState.InTable);
                return true;
            }
            if ((token.AkhnZx() && C59910zrS.AEQbTJ(token.OLrzqt().AuCTel(), "caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr")) || (token.valueOf() && token.AEQbTJ().AuCTel().equals("table"))) {
                c59951zsg.KWHzl(this);
                if (c59951zsg.OLrzqt(new Token.Application("caption"))) {
                    return c59951zsg.OLrzqt(token);
                }
                return true;
            }
            if (token.valueOf() && C59910zrS.AEQbTJ(token.AEQbTJ().AuCTel(), "body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr")) {
                c59951zsg.KWHzl(this);
                return false;
            }
            return c59951zsg.EZpvd(token, HtmlTreeBuilderState.InBody);
        }
    },
    InColumnGroup { // from class: org.jsoup.parser.HtmlTreeBuilderState.12
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C59951zsg c59951zsg) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                c59951zsg.AEQbTJ(token.copydefault());
                return true;
            }
            int i = AnonymousClass24.OLrzqt[token.copydefault.ordinal()];
            if (i == 1) {
                c59951zsg.OLrzqt(token.EZpvd());
            } else if (i == 2) {
                c59951zsg.KWHzl(this);
            } else if (i == 3) {
                Token.Dialog dialogOLrzqt = token.OLrzqt();
                String strAuCTel = dialogOLrzqt.AuCTel();
                if (strAuCTel.equals("html")) {
                    return c59951zsg.EZpvd(token, HtmlTreeBuilderState.InBody);
                }
                if (strAuCTel.equals("col")) {
                    c59951zsg.KWHzl(dialogOLrzqt);
                } else {
                    return anythingElse(token, c59951zsg);
                }
            } else {
                if (i != 4) {
                    if (i == 6) {
                        if (c59951zsg.uzCIH().copydefault().equals("html")) {
                            return true;
                        }
                        return anythingElse(token, c59951zsg);
                    }
                    return anythingElse(token, c59951zsg);
                }
                if (token.AEQbTJ().AuCTel().equals("colgroup")) {
                    if (c59951zsg.uzCIH().copydefault().equals("html")) {
                        c59951zsg.KWHzl(this);
                        return false;
                    }
                    c59951zsg.fIwbmz();
                    c59951zsg.OLrzqt(HtmlTreeBuilderState.InTable);
                } else {
                    return anythingElse(token, c59951zsg);
                }
            }
            return true;
        }

        private boolean anythingElse(Token token, AbstractC59954zsj abstractC59954zsj) {
            if (abstractC59954zsj.OLrzqt(new Token.Application("colgroup"))) {
                return abstractC59954zsj.OLrzqt(token);
            }
            return true;
        }
    },
    InTableBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.13
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C59951zsg c59951zsg) {
            int i = AnonymousClass24.OLrzqt[token.copydefault.ordinal()];
            if (i == 3) {
                Token.Dialog dialogOLrzqt = token.OLrzqt();
                String strAuCTel = dialogOLrzqt.AuCTel();
                if (strAuCTel.equals("tr")) {
                    c59951zsg.AEQbTJ();
                    c59951zsg.copydefault(dialogOLrzqt);
                    c59951zsg.OLrzqt(HtmlTreeBuilderState.InRow);
                    return true;
                }
                if (C59910zrS.AEQbTJ(strAuCTel, "th", "td")) {
                    c59951zsg.KWHzl(this);
                    c59951zsg.OLrzqt(new Token.Dialog("tr"));
                    return c59951zsg.OLrzqt(dialogOLrzqt);
                }
                if (C59910zrS.AEQbTJ(strAuCTel, "caption", "col", "colgroup", "tbody", "tfoot", "thead")) {
                    return exitTableBody(token, c59951zsg);
                }
                return anythingElse(token, c59951zsg);
            }
            if (i == 4) {
                String strAuCTel2 = token.AEQbTJ().AuCTel();
                if (C59910zrS.AEQbTJ(strAuCTel2, "tbody", "tfoot", "thead")) {
                    if (!c59951zsg.gEmmrt(strAuCTel2)) {
                        c59951zsg.KWHzl(this);
                        return false;
                    }
                    c59951zsg.AEQbTJ();
                    c59951zsg.fIwbmz();
                    c59951zsg.OLrzqt(HtmlTreeBuilderState.InTable);
                    return true;
                }
                if (strAuCTel2.equals("table")) {
                    return exitTableBody(token, c59951zsg);
                }
                if (C59910zrS.AEQbTJ(strAuCTel2, "body", "caption", "col", "colgroup", "html", "td", "th", "tr")) {
                    c59951zsg.KWHzl(this);
                    return false;
                }
                return anythingElse(token, c59951zsg);
            }
            return anythingElse(token, c59951zsg);
        }

        private boolean exitTableBody(Token token, C59951zsg c59951zsg) {
            if (!c59951zsg.gEmmrt("tbody") && !c59951zsg.gEmmrt("thead") && !c59951zsg.AhwBna("tfoot")) {
                c59951zsg.KWHzl(this);
                return false;
            }
            c59951zsg.AEQbTJ();
            c59951zsg.OLrzqt(new Token.Application(c59951zsg.uzCIH().copydefault()));
            return c59951zsg.OLrzqt(token);
        }

        private boolean anythingElse(Token token, C59951zsg c59951zsg) {
            return c59951zsg.EZpvd(token, HtmlTreeBuilderState.InTable);
        }
    },
    InRow { // from class: org.jsoup.parser.HtmlTreeBuilderState.14
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C59951zsg c59951zsg) {
            if (token.AkhnZx()) {
                Token.Dialog dialogOLrzqt = token.OLrzqt();
                String strAuCTel = dialogOLrzqt.AuCTel();
                if (C59910zrS.AEQbTJ(strAuCTel, "th", "td")) {
                    c59951zsg.KWHzl();
                    c59951zsg.copydefault(dialogOLrzqt);
                    c59951zsg.OLrzqt(HtmlTreeBuilderState.InCell);
                    c59951zsg.DbNXlk();
                    return true;
                }
                if (C59910zrS.AEQbTJ(strAuCTel, "caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr")) {
                    return handleMissingTr(token, c59951zsg);
                }
                return anythingElse(token, c59951zsg);
            }
            if (token.valueOf()) {
                String strAuCTel2 = token.AEQbTJ().AuCTel();
                if (strAuCTel2.equals("tr")) {
                    if (!c59951zsg.gEmmrt(strAuCTel2)) {
                        c59951zsg.KWHzl(this);
                        return false;
                    }
                    c59951zsg.KWHzl();
                    c59951zsg.fIwbmz();
                    c59951zsg.OLrzqt(HtmlTreeBuilderState.InTableBody);
                    return true;
                }
                if (strAuCTel2.equals("table")) {
                    return handleMissingTr(token, c59951zsg);
                }
                if (C59910zrS.AEQbTJ(strAuCTel2, "tbody", "tfoot", "thead")) {
                    if (!c59951zsg.gEmmrt(strAuCTel2)) {
                        c59951zsg.KWHzl(this);
                        return false;
                    }
                    c59951zsg.OLrzqt(new Token.Application("tr"));
                    return c59951zsg.OLrzqt(token);
                }
                if (C59910zrS.AEQbTJ(strAuCTel2, "body", "caption", "col", "colgroup", "html", "td", "th")) {
                    c59951zsg.KWHzl(this);
                    return false;
                }
                return anythingElse(token, c59951zsg);
            }
            return anythingElse(token, c59951zsg);
        }

        private boolean anythingElse(Token token, C59951zsg c59951zsg) {
            return c59951zsg.EZpvd(token, HtmlTreeBuilderState.InTable);
        }

        private boolean handleMissingTr(Token token, AbstractC59954zsj abstractC59954zsj) {
            if (abstractC59954zsj.OLrzqt(new Token.Application("tr"))) {
                return abstractC59954zsj.OLrzqt(token);
            }
            return false;
        }
    },
    InCell { // from class: org.jsoup.parser.HtmlTreeBuilderState.15
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C59951zsg c59951zsg) {
            if (token.valueOf()) {
                String strAuCTel = token.AEQbTJ().AuCTel();
                if (C59910zrS.AEQbTJ(strAuCTel, "td", "th")) {
                    if (!c59951zsg.gEmmrt(strAuCTel)) {
                        c59951zsg.KWHzl(this);
                        c59951zsg.OLrzqt(HtmlTreeBuilderState.InRow);
                        return false;
                    }
                    c59951zsg.AhwBna();
                    if (!c59951zsg.uzCIH().copydefault().equals(strAuCTel)) {
                        c59951zsg.KWHzl(this);
                    }
                    c59951zsg.DbNXlk(strAuCTel);
                    c59951zsg.EZpvd();
                    c59951zsg.OLrzqt(HtmlTreeBuilderState.InRow);
                    return true;
                }
                if (C59910zrS.AEQbTJ(strAuCTel, "body", "caption", "col", "colgroup", "html")) {
                    c59951zsg.KWHzl(this);
                    return false;
                }
                if (C59910zrS.AEQbTJ(strAuCTel, "table", "tbody", "tfoot", "thead", "tr")) {
                    if (!c59951zsg.gEmmrt(strAuCTel)) {
                        c59951zsg.KWHzl(this);
                        return false;
                    }
                    closeCell(c59951zsg);
                    return c59951zsg.OLrzqt(token);
                }
                return anythingElse(token, c59951zsg);
            }
            if (token.AkhnZx() && C59910zrS.AEQbTJ(token.OLrzqt().AuCTel(), "caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr")) {
                if (!c59951zsg.gEmmrt("td") && !c59951zsg.gEmmrt("th")) {
                    c59951zsg.KWHzl(this);
                    return false;
                }
                closeCell(c59951zsg);
                return c59951zsg.OLrzqt(token);
            }
            return anythingElse(token, c59951zsg);
        }

        private boolean anythingElse(Token token, C59951zsg c59951zsg) {
            return c59951zsg.EZpvd(token, HtmlTreeBuilderState.InBody);
        }

        private void closeCell(C59951zsg c59951zsg) {
            if (c59951zsg.gEmmrt("td")) {
                c59951zsg.OLrzqt(new Token.Application("td"));
            } else {
                c59951zsg.OLrzqt(new Token.Application("th"));
            }
        }
    },
    InSelect { // from class: org.jsoup.parser.HtmlTreeBuilderState.16
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C59951zsg c59951zsg) {
            switch (AnonymousClass24.OLrzqt[token.copydefault.ordinal()]) {
                case 1:
                    c59951zsg.OLrzqt(token.EZpvd());
                    return true;
                case 2:
                    c59951zsg.KWHzl(this);
                    return false;
                case 3:
                    Token.Dialog dialogOLrzqt = token.OLrzqt();
                    String strAuCTel = dialogOLrzqt.AuCTel();
                    if (strAuCTel.equals("html")) {
                        return c59951zsg.EZpvd(dialogOLrzqt, HtmlTreeBuilderState.InBody);
                    }
                    if (strAuCTel.equals("option")) {
                        c59951zsg.OLrzqt(new Token.Application("option"));
                        c59951zsg.copydefault(dialogOLrzqt);
                        return true;
                    }
                    if (strAuCTel.equals("optgroup")) {
                        if (c59951zsg.uzCIH().copydefault().equals("option")) {
                            c59951zsg.OLrzqt(new Token.Application("option"));
                        } else if (c59951zsg.uzCIH().copydefault().equals("optgroup")) {
                            c59951zsg.OLrzqt(new Token.Application("optgroup"));
                        }
                        c59951zsg.copydefault(dialogOLrzqt);
                        return true;
                    }
                    if (strAuCTel.equals("select")) {
                        c59951zsg.KWHzl(this);
                        return c59951zsg.OLrzqt(new Token.Application("select"));
                    }
                    if (C59910zrS.AEQbTJ(strAuCTel, Web3SecurityTrackEvent.VALUE_INPUT, "keygen", "textarea")) {
                        c59951zsg.KWHzl(this);
                        if (!c59951zsg.valueOf("select")) {
                            return false;
                        }
                        c59951zsg.OLrzqt(new Token.Application("select"));
                        return c59951zsg.OLrzqt(dialogOLrzqt);
                    }
                    if (strAuCTel.equals("script")) {
                        return c59951zsg.EZpvd(token, HtmlTreeBuilderState.InHead);
                    }
                    return anythingElse(token, c59951zsg);
                case 4:
                    String strAuCTel2 = token.AEQbTJ().AuCTel();
                    if (strAuCTel2.equals("optgroup")) {
                        if (c59951zsg.uzCIH().copydefault().equals("option") && c59951zsg.copydefault(c59951zsg.uzCIH()) != null && c59951zsg.copydefault(c59951zsg.uzCIH()).copydefault().equals("optgroup")) {
                            c59951zsg.OLrzqt(new Token.Application("option"));
                        }
                        if (c59951zsg.uzCIH().copydefault().equals("optgroup")) {
                            c59951zsg.fIwbmz();
                            return true;
                        }
                        c59951zsg.KWHzl(this);
                        return true;
                    }
                    if (strAuCTel2.equals("option")) {
                        if (c59951zsg.uzCIH().copydefault().equals("option")) {
                            c59951zsg.fIwbmz();
                            return true;
                        }
                        c59951zsg.KWHzl(this);
                        return true;
                    }
                    if (strAuCTel2.equals("select")) {
                        if (!c59951zsg.valueOf(strAuCTel2)) {
                            c59951zsg.KWHzl(this);
                            return false;
                        }
                        c59951zsg.DbNXlk(strAuCTel2);
                        c59951zsg.hDKMBd();
                        return true;
                    }
                    return anythingElse(token, c59951zsg);
                case 5:
                    Token.Activity activityCopydefault = token.copydefault();
                    if (activityCopydefault.values().equals(HtmlTreeBuilderState.nullString)) {
                        c59951zsg.KWHzl(this);
                        return false;
                    }
                    c59951zsg.AEQbTJ(activityCopydefault);
                    return true;
                case 6:
                    if (c59951zsg.uzCIH().copydefault().equals("html")) {
                        return true;
                    }
                    c59951zsg.KWHzl(this);
                    return true;
                default:
                    return anythingElse(token, c59951zsg);
            }
        }

        private boolean anythingElse(Token token, C59951zsg c59951zsg) {
            c59951zsg.KWHzl(this);
            return false;
        }
    },
    InSelectInTable { // from class: org.jsoup.parser.HtmlTreeBuilderState.17
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C59951zsg c59951zsg) {
            if (token.AkhnZx() && C59910zrS.AEQbTJ(token.OLrzqt().AuCTel(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th")) {
                c59951zsg.KWHzl(this);
                c59951zsg.OLrzqt(new Token.Application("select"));
                return c59951zsg.OLrzqt(token);
            }
            if (token.valueOf() && C59910zrS.AEQbTJ(token.AEQbTJ().AuCTel(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th")) {
                c59951zsg.KWHzl(this);
                if (!c59951zsg.gEmmrt(token.AEQbTJ().AuCTel())) {
                    return false;
                }
                c59951zsg.OLrzqt(new Token.Application("select"));
                return c59951zsg.OLrzqt(token);
            }
            return c59951zsg.EZpvd(token, HtmlTreeBuilderState.InSelect);
        }
    },
    AfterBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.18
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C59951zsg c59951zsg) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                return c59951zsg.EZpvd(token, HtmlTreeBuilderState.InBody);
            }
            if (token.AhwBna()) {
                c59951zsg.OLrzqt(token.EZpvd());
                return true;
            }
            if (token.AYXKKw()) {
                c59951zsg.KWHzl(this);
                return false;
            }
            if (token.AkhnZx() && token.OLrzqt().AuCTel().equals("html")) {
                return c59951zsg.EZpvd(token, HtmlTreeBuilderState.InBody);
            }
            if (token.valueOf() && token.AEQbTJ().AuCTel().equals("html")) {
                if (c59951zsg.AkhnZx()) {
                    c59951zsg.KWHzl(this);
                    return false;
                }
                c59951zsg.OLrzqt(HtmlTreeBuilderState.AfterAfterBody);
                return true;
            }
            if (token.djBIcL()) {
                return true;
            }
            c59951zsg.KWHzl(this);
            c59951zsg.OLrzqt(HtmlTreeBuilderState.InBody);
            return c59951zsg.OLrzqt(token);
        }
    },
    InFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.19
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C59951zsg c59951zsg) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                c59951zsg.AEQbTJ(token.copydefault());
                return true;
            }
            if (token.AhwBna()) {
                c59951zsg.OLrzqt(token.EZpvd());
                return true;
            }
            if (token.AYXKKw()) {
                c59951zsg.KWHzl(this);
                return false;
            }
            if (token.AkhnZx()) {
                Token.Dialog dialogOLrzqt = token.OLrzqt();
                String strAuCTel = dialogOLrzqt.AuCTel();
                if (strAuCTel.equals("html")) {
                    return c59951zsg.EZpvd(dialogOLrzqt, HtmlTreeBuilderState.InBody);
                }
                if (strAuCTel.equals("frameset")) {
                    c59951zsg.copydefault(dialogOLrzqt);
                    return true;
                }
                if (strAuCTel.equals(TypedValues.AttributesType.S_FRAME)) {
                    c59951zsg.KWHzl(dialogOLrzqt);
                    return true;
                }
                if (strAuCTel.equals("noframes")) {
                    return c59951zsg.EZpvd(dialogOLrzqt, HtmlTreeBuilderState.InHead);
                }
                c59951zsg.KWHzl(this);
                return false;
            }
            if (token.valueOf() && token.AEQbTJ().AuCTel().equals("frameset")) {
                if (c59951zsg.uzCIH().copydefault().equals("html")) {
                    c59951zsg.KWHzl(this);
                    return false;
                }
                c59951zsg.fIwbmz();
                if (c59951zsg.AkhnZx() || c59951zsg.uzCIH().copydefault().equals("frameset")) {
                    return true;
                }
                c59951zsg.OLrzqt(HtmlTreeBuilderState.AfterFrameset);
                return true;
            }
            if (token.djBIcL()) {
                if (c59951zsg.uzCIH().copydefault().equals("html")) {
                    return true;
                }
                c59951zsg.KWHzl(this);
                return true;
            }
            c59951zsg.KWHzl(this);
            return false;
        }
    },
    AfterFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.20
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C59951zsg c59951zsg) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                c59951zsg.AEQbTJ(token.copydefault());
                return true;
            }
            if (token.AhwBna()) {
                c59951zsg.OLrzqt(token.EZpvd());
                return true;
            }
            if (token.AYXKKw()) {
                c59951zsg.KWHzl(this);
                return false;
            }
            if (token.AkhnZx() && token.OLrzqt().AuCTel().equals("html")) {
                return c59951zsg.EZpvd(token, HtmlTreeBuilderState.InBody);
            }
            if (token.valueOf() && token.AEQbTJ().AuCTel().equals("html")) {
                c59951zsg.OLrzqt(HtmlTreeBuilderState.AfterAfterFrameset);
                return true;
            }
            if (token.AkhnZx() && token.OLrzqt().AuCTel().equals("noframes")) {
                return c59951zsg.EZpvd(token, HtmlTreeBuilderState.InHead);
            }
            if (token.djBIcL()) {
                return true;
            }
            c59951zsg.KWHzl(this);
            return false;
        }
    },
    AfterAfterBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.21
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C59951zsg c59951zsg) {
            if (token.AhwBna()) {
                c59951zsg.OLrzqt(token.EZpvd());
                return true;
            }
            if (token.AYXKKw() || HtmlTreeBuilderState.isWhitespace(token) || (token.AkhnZx() && token.OLrzqt().AuCTel().equals("html"))) {
                return c59951zsg.EZpvd(token, HtmlTreeBuilderState.InBody);
            }
            if (token.djBIcL()) {
                return true;
            }
            c59951zsg.KWHzl(this);
            c59951zsg.OLrzqt(HtmlTreeBuilderState.InBody);
            return c59951zsg.OLrzqt(token);
        }
    },
    AfterAfterFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.22
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C59951zsg c59951zsg) {
            if (token.AhwBna()) {
                c59951zsg.OLrzqt(token.EZpvd());
                return true;
            }
            if (token.AYXKKw() || HtmlTreeBuilderState.isWhitespace(token) || (token.AkhnZx() && token.OLrzqt().AuCTel().equals("html"))) {
                return c59951zsg.EZpvd(token, HtmlTreeBuilderState.InBody);
            }
            if (token.djBIcL()) {
                return true;
            }
            if (token.AkhnZx() && token.OLrzqt().AuCTel().equals("noframes")) {
                return c59951zsg.EZpvd(token, HtmlTreeBuilderState.InHead);
            }
            c59951zsg.KWHzl(this);
            return false;
        }
    },
    ForeignContent { // from class: org.jsoup.parser.HtmlTreeBuilderState.23
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C59951zsg c59951zsg) {
            return true;
        }
    };

    private static String nullString = String.valueOf((char) 0);

    public abstract boolean process(Token token, C59951zsg c59951zsg);

    /* JADX INFO: renamed from: org.jsoup.parser.HtmlTreeBuilderState$24, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass24 {
        public static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[Token.TokenType.values().length];
            OLrzqt = iArr;
            try {
                iArr[Token.TokenType.Comment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OLrzqt[Token.TokenType.Doctype.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OLrzqt[Token.TokenType.StartTag.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                OLrzqt[Token.TokenType.EndTag.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                OLrzqt[Token.TokenType.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                OLrzqt[Token.TokenType.EOF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isWhitespace(Token token) {
        if (!token.gEmmrt()) {
            return false;
        }
        String strValues = token.copydefault().values();
        for (int i = 0; i < strValues.length(); i++) {
            if (!C59910zrS.KWHzl(strValues.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleRcData(Token.Dialog dialog, C59951zsg c59951zsg) {
        c59951zsg.copydefault(dialog);
        c59951zsg.ejfBZ.KWHzl(TokeniserState.Rcdata);
        c59951zsg.fARcdN();
        c59951zsg.OLrzqt(Text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleRawtext(Token.Dialog dialog, C59951zsg c59951zsg) {
        c59951zsg.copydefault(dialog);
        c59951zsg.ejfBZ.KWHzl(TokeniserState.Rawtext);
        c59951zsg.fARcdN();
        c59951zsg.OLrzqt(Text);
    }
}
