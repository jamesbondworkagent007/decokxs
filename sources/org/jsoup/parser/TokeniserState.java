package org.jsoup.parser;

import com.fasterxml.jackson.core.JsonPointer;
import o.C59950zsf;
import o.C59953zsi;
import org.jsoup.parser.Token;

/* JADX INFO: loaded from: classes20.dex */
public enum TokeniserState {
    Data { // from class: org.jsoup.parser.TokeniserState.1
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cValueOf = c59950zsf.valueOf();
            if (cValueOf == 0) {
                c59953zsi.OLrzqt(this);
                c59953zsi.OLrzqt(c59950zsf.AEQbTJ());
            } else {
                if (cValueOf == '&') {
                    c59953zsi.EZpvd(TokeniserState.CharacterReferenceInData);
                    return;
                }
                if (cValueOf == '<') {
                    c59953zsi.EZpvd(TokeniserState.TagOpen);
                } else if (cValueOf == 65535) {
                    c59953zsi.KWHzl(new Token.ActionBar());
                } else {
                    c59953zsi.copydefault(c59950zsf.EZpvd('&', '<', 0));
                }
            }
        }
    },
    CharacterReferenceInData { // from class: org.jsoup.parser.TokeniserState.2
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char[] cArrEZpvd = c59953zsi.EZpvd(null, false);
            if (cArrEZpvd == null) {
                c59953zsi.OLrzqt('&');
            } else {
                c59953zsi.OLrzqt(cArrEZpvd);
            }
            c59953zsi.KWHzl(TokeniserState.Data);
        }
    },
    Rcdata { // from class: org.jsoup.parser.TokeniserState.3
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cValueOf = c59950zsf.valueOf();
            if (cValueOf == 0) {
                c59953zsi.OLrzqt(this);
                c59950zsf.copydefault();
                c59953zsi.OLrzqt((char) 65533);
            } else {
                if (cValueOf == '&') {
                    c59953zsi.EZpvd(TokeniserState.CharacterReferenceInRcdata);
                    return;
                }
                if (cValueOf == '<') {
                    c59953zsi.EZpvd(TokeniserState.RcdataLessthanSign);
                } else if (cValueOf == 65535) {
                    c59953zsi.KWHzl(new Token.ActionBar());
                } else {
                    c59953zsi.copydefault(c59950zsf.EZpvd('&', '<', 0));
                }
            }
        }
    },
    CharacterReferenceInRcdata { // from class: org.jsoup.parser.TokeniserState.4
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char[] cArrEZpvd = c59953zsi.EZpvd(null, false);
            if (cArrEZpvd == null) {
                c59953zsi.OLrzqt('&');
            } else {
                c59953zsi.OLrzqt(cArrEZpvd);
            }
            c59953zsi.KWHzl(TokeniserState.Rcdata);
        }
    },
    Rawtext { // from class: org.jsoup.parser.TokeniserState.5
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cValueOf = c59950zsf.valueOf();
            if (cValueOf == 0) {
                c59953zsi.OLrzqt(this);
                c59950zsf.copydefault();
                c59953zsi.OLrzqt((char) 65533);
            } else if (cValueOf == '<') {
                c59953zsi.EZpvd(TokeniserState.RawtextLessthanSign);
            } else if (cValueOf == 65535) {
                c59953zsi.KWHzl(new Token.ActionBar());
            } else {
                c59953zsi.copydefault(c59950zsf.EZpvd('<', 0));
            }
        }
    },
    ScriptData { // from class: org.jsoup.parser.TokeniserState.6
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cValueOf = c59950zsf.valueOf();
            if (cValueOf == 0) {
                c59953zsi.OLrzqt(this);
                c59950zsf.copydefault();
                c59953zsi.OLrzqt((char) 65533);
            } else if (cValueOf == '<') {
                c59953zsi.EZpvd(TokeniserState.ScriptDataLessthanSign);
            } else if (cValueOf == 65535) {
                c59953zsi.KWHzl(new Token.ActionBar());
            } else {
                c59953zsi.copydefault(c59950zsf.EZpvd('<', 0));
            }
        }
    },
    PLAINTEXT { // from class: org.jsoup.parser.TokeniserState.7
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cValueOf = c59950zsf.valueOf();
            if (cValueOf == 0) {
                c59953zsi.OLrzqt(this);
                c59950zsf.copydefault();
                c59953zsi.OLrzqt((char) 65533);
            } else if (cValueOf == 65535) {
                c59953zsi.KWHzl(new Token.ActionBar());
            } else {
                c59953zsi.copydefault(c59950zsf.copydefault((char) 0));
            }
        }
    },
    TagOpen { // from class: org.jsoup.parser.TokeniserState.8
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cValueOf = c59950zsf.valueOf();
            if (cValueOf == '!') {
                c59953zsi.EZpvd(TokeniserState.MarkupDeclarationOpen);
                return;
            }
            if (cValueOf == '/') {
                c59953zsi.EZpvd(TokeniserState.EndTagOpen);
                return;
            }
            if (cValueOf == '?') {
                c59953zsi.EZpvd(TokeniserState.BogusComment);
                return;
            }
            if (c59950zsf.DbNXlk()) {
                c59953zsi.AEQbTJ(true);
                c59953zsi.KWHzl(TokeniserState.TagName);
            } else {
                c59953zsi.OLrzqt(this);
                c59953zsi.OLrzqt('<');
                c59953zsi.KWHzl(TokeniserState.Data);
            }
        }
    },
    EndTagOpen { // from class: org.jsoup.parser.TokeniserState.9
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            if (c59950zsf.AhwBna()) {
                c59953zsi.AEQbTJ(this);
                c59953zsi.copydefault("</");
                c59953zsi.KWHzl(TokeniserState.Data);
            } else if (c59950zsf.DbNXlk()) {
                c59953zsi.AEQbTJ(false);
                c59953zsi.KWHzl(TokeniserState.TagName);
            } else if (c59950zsf.AEQbTJ('>')) {
                c59953zsi.OLrzqt(this);
                c59953zsi.EZpvd(TokeniserState.Data);
            } else {
                c59953zsi.OLrzqt(this);
                c59953zsi.EZpvd(TokeniserState.BogusComment);
            }
        }
    },
    TagName { // from class: org.jsoup.parser.TokeniserState.10
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            c59953zsi.DbNXlk.EZpvd(c59950zsf.EZpvd('\t', '\n', '\r', '\f', ' ', JsonPointer.SEPARATOR, '>', 0).toLowerCase());
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ != 0) {
                if (cAEQbTJ != ' ') {
                    if (cAEQbTJ == '/') {
                        c59953zsi.KWHzl(TokeniserState.SelfClosingStartTag);
                        return;
                    }
                    if (cAEQbTJ == '>') {
                        c59953zsi.AYXKKw();
                        c59953zsi.KWHzl(TokeniserState.Data);
                        return;
                    } else if (cAEQbTJ == 65535) {
                        c59953zsi.AEQbTJ(this);
                        c59953zsi.KWHzl(TokeniserState.Data);
                        return;
                    } else if (cAEQbTJ != '\t' && cAEQbTJ != '\n' && cAEQbTJ != '\f' && cAEQbTJ != '\r') {
                        return;
                    }
                }
                c59953zsi.KWHzl(TokeniserState.BeforeAttributeName);
                return;
            }
            c59953zsi.DbNXlk.EZpvd(TokeniserState.replacementStr);
        }
    },
    RcdataLessthanSign { // from class: org.jsoup.parser.TokeniserState.11
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            if (c59950zsf.AEQbTJ(JsonPointer.SEPARATOR)) {
                c59953zsi.copydefault();
                c59953zsi.EZpvd(TokeniserState.RCDATAEndTagOpen);
                return;
            }
            if (c59950zsf.DbNXlk()) {
                if (!c59950zsf.EZpvd("</" + c59953zsi.KWHzl())) {
                    c59953zsi.DbNXlk = new Token.Application(c59953zsi.KWHzl());
                    c59953zsi.AYXKKw();
                    c59950zsf.values();
                    c59953zsi.KWHzl(TokeniserState.Data);
                    return;
                }
            }
            c59953zsi.copydefault("<");
            c59953zsi.KWHzl(TokeniserState.Rcdata);
        }
    },
    RCDATAEndTagOpen { // from class: org.jsoup.parser.TokeniserState.12
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            if (c59950zsf.DbNXlk()) {
                c59953zsi.AEQbTJ(false);
                c59953zsi.DbNXlk.KWHzl(Character.toLowerCase(c59950zsf.valueOf()));
                c59953zsi.OLrzqt.append(Character.toLowerCase(c59950zsf.valueOf()));
                c59953zsi.EZpvd(TokeniserState.RCDATAEndTagName);
                return;
            }
            c59953zsi.copydefault("</");
            c59953zsi.KWHzl(TokeniserState.Rcdata);
        }
    },
    RCDATAEndTagName { // from class: org.jsoup.parser.TokeniserState.13
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            if (c59950zsf.DbNXlk()) {
                String strOLrzqt = c59950zsf.OLrzqt();
                c59953zsi.DbNXlk.EZpvd(strOLrzqt.toLowerCase());
                c59953zsi.OLrzqt.append(strOLrzqt);
                return;
            }
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == '\t' || cAEQbTJ == '\n' || cAEQbTJ == '\f' || cAEQbTJ == '\r' || cAEQbTJ == ' ') {
                if (c59953zsi.AhwBna()) {
                    c59953zsi.KWHzl(TokeniserState.BeforeAttributeName);
                    return;
                } else {
                    anythingElse(c59953zsi, c59950zsf);
                    return;
                }
            }
            if (cAEQbTJ == '/') {
                if (c59953zsi.AhwBna()) {
                    c59953zsi.KWHzl(TokeniserState.SelfClosingStartTag);
                    return;
                } else {
                    anythingElse(c59953zsi, c59950zsf);
                    return;
                }
            }
            if (cAEQbTJ == '>') {
                if (c59953zsi.AhwBna()) {
                    c59953zsi.AYXKKw();
                    c59953zsi.KWHzl(TokeniserState.Data);
                    return;
                } else {
                    anythingElse(c59953zsi, c59950zsf);
                    return;
                }
            }
            anythingElse(c59953zsi, c59950zsf);
        }

        private void anythingElse(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            c59953zsi.copydefault("</" + c59953zsi.OLrzqt.toString());
            c59950zsf.values();
            c59953zsi.KWHzl(TokeniserState.Rcdata);
        }
    },
    RawtextLessthanSign { // from class: org.jsoup.parser.TokeniserState.14
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            if (c59950zsf.AEQbTJ(JsonPointer.SEPARATOR)) {
                c59953zsi.copydefault();
                c59953zsi.EZpvd(TokeniserState.RawtextEndTagOpen);
            } else {
                c59953zsi.OLrzqt('<');
                c59953zsi.KWHzl(TokeniserState.Rawtext);
            }
        }
    },
    RawtextEndTagOpen { // from class: org.jsoup.parser.TokeniserState.15
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            if (c59950zsf.DbNXlk()) {
                c59953zsi.AEQbTJ(false);
                c59953zsi.KWHzl(TokeniserState.RawtextEndTagName);
            } else {
                c59953zsi.copydefault("</");
                c59953zsi.KWHzl(TokeniserState.Rawtext);
            }
        }
    },
    RawtextEndTagName { // from class: org.jsoup.parser.TokeniserState.16
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            if (c59950zsf.DbNXlk()) {
                String strOLrzqt = c59950zsf.OLrzqt();
                c59953zsi.DbNXlk.EZpvd(strOLrzqt.toLowerCase());
                c59953zsi.OLrzqt.append(strOLrzqt);
                return;
            }
            if (c59953zsi.AhwBna() && !c59950zsf.AhwBna()) {
                char cAEQbTJ = c59950zsf.AEQbTJ();
                if (cAEQbTJ == '\t' || cAEQbTJ == '\n' || cAEQbTJ == '\f' || cAEQbTJ == '\r' || cAEQbTJ == ' ') {
                    c59953zsi.KWHzl(TokeniserState.BeforeAttributeName);
                    return;
                }
                if (cAEQbTJ == '/') {
                    c59953zsi.KWHzl(TokeniserState.SelfClosingStartTag);
                    return;
                } else if (cAEQbTJ == '>') {
                    c59953zsi.AYXKKw();
                    c59953zsi.KWHzl(TokeniserState.Data);
                    return;
                } else {
                    c59953zsi.OLrzqt.append(cAEQbTJ);
                    anythingElse(c59953zsi, c59950zsf);
                    return;
                }
            }
            anythingElse(c59953zsi, c59950zsf);
        }

        private void anythingElse(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            c59953zsi.copydefault("</" + c59953zsi.OLrzqt.toString());
            c59953zsi.KWHzl(TokeniserState.Rawtext);
        }
    },
    ScriptDataLessthanSign { // from class: org.jsoup.parser.TokeniserState.17
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == '!') {
                c59953zsi.copydefault("<!");
                c59953zsi.KWHzl(TokeniserState.ScriptDataEscapeStart);
            } else if (cAEQbTJ == '/') {
                c59953zsi.copydefault();
                c59953zsi.KWHzl(TokeniserState.ScriptDataEndTagOpen);
            } else {
                c59953zsi.copydefault("<");
                c59950zsf.values();
                c59953zsi.KWHzl(TokeniserState.ScriptData);
            }
        }
    },
    ScriptDataEndTagOpen { // from class: org.jsoup.parser.TokeniserState.18
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            if (c59950zsf.DbNXlk()) {
                c59953zsi.AEQbTJ(false);
                c59953zsi.KWHzl(TokeniserState.ScriptDataEndTagName);
            } else {
                c59953zsi.copydefault("</");
                c59953zsi.KWHzl(TokeniserState.ScriptData);
            }
        }
    },
    ScriptDataEndTagName { // from class: org.jsoup.parser.TokeniserState.19
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            if (c59950zsf.DbNXlk()) {
                String strOLrzqt = c59950zsf.OLrzqt();
                c59953zsi.DbNXlk.EZpvd(strOLrzqt.toLowerCase());
                c59953zsi.OLrzqt.append(strOLrzqt);
                return;
            }
            if (c59953zsi.AhwBna() && !c59950zsf.AhwBna()) {
                char cAEQbTJ = c59950zsf.AEQbTJ();
                if (cAEQbTJ == '\t' || cAEQbTJ == '\n' || cAEQbTJ == '\f' || cAEQbTJ == '\r' || cAEQbTJ == ' ') {
                    c59953zsi.KWHzl(TokeniserState.BeforeAttributeName);
                    return;
                }
                if (cAEQbTJ == '/') {
                    c59953zsi.KWHzl(TokeniserState.SelfClosingStartTag);
                    return;
                } else if (cAEQbTJ == '>') {
                    c59953zsi.AYXKKw();
                    c59953zsi.KWHzl(TokeniserState.Data);
                    return;
                } else {
                    c59953zsi.OLrzqt.append(cAEQbTJ);
                    anythingElse(c59953zsi, c59950zsf);
                    return;
                }
            }
            anythingElse(c59953zsi, c59950zsf);
        }

        private void anythingElse(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            c59953zsi.copydefault("</" + c59953zsi.OLrzqt.toString());
            c59953zsi.KWHzl(TokeniserState.ScriptData);
        }
    },
    ScriptDataEscapeStart { // from class: org.jsoup.parser.TokeniserState.20
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            if (c59950zsf.AEQbTJ('-')) {
                c59953zsi.OLrzqt('-');
                c59953zsi.EZpvd(TokeniserState.ScriptDataEscapeStartDash);
            } else {
                c59953zsi.KWHzl(TokeniserState.ScriptData);
            }
        }
    },
    ScriptDataEscapeStartDash { // from class: org.jsoup.parser.TokeniserState.21
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            if (c59950zsf.AEQbTJ('-')) {
                c59953zsi.OLrzqt('-');
                c59953zsi.EZpvd(TokeniserState.ScriptDataEscapedDashDash);
            } else {
                c59953zsi.KWHzl(TokeniserState.ScriptData);
            }
        }
    },
    ScriptDataEscaped { // from class: org.jsoup.parser.TokeniserState.22
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            if (c59950zsf.AhwBna()) {
                c59953zsi.AEQbTJ(this);
                c59953zsi.KWHzl(TokeniserState.Data);
                return;
            }
            char cValueOf = c59950zsf.valueOf();
            if (cValueOf == 0) {
                c59953zsi.OLrzqt(this);
                c59950zsf.copydefault();
                c59953zsi.OLrzqt((char) 65533);
            } else if (cValueOf == '-') {
                c59953zsi.OLrzqt('-');
                c59953zsi.EZpvd(TokeniserState.ScriptDataEscapedDash);
            } else if (cValueOf == '<') {
                c59953zsi.EZpvd(TokeniserState.ScriptDataEscapedLessthanSign);
            } else {
                c59953zsi.copydefault(c59950zsf.EZpvd('-', '<', 0));
            }
        }
    },
    ScriptDataEscapedDash { // from class: org.jsoup.parser.TokeniserState.23
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            if (c59950zsf.AhwBna()) {
                c59953zsi.AEQbTJ(this);
                c59953zsi.KWHzl(TokeniserState.Data);
                return;
            }
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == 0) {
                c59953zsi.OLrzqt(this);
                c59953zsi.OLrzqt((char) 65533);
                c59953zsi.KWHzl(TokeniserState.ScriptDataEscaped);
            } else if (cAEQbTJ == '-') {
                c59953zsi.OLrzqt(cAEQbTJ);
                c59953zsi.KWHzl(TokeniserState.ScriptDataEscapedDashDash);
            } else if (cAEQbTJ == '<') {
                c59953zsi.KWHzl(TokeniserState.ScriptDataEscapedLessthanSign);
            } else {
                c59953zsi.OLrzqt(cAEQbTJ);
                c59953zsi.KWHzl(TokeniserState.ScriptDataEscaped);
            }
        }
    },
    ScriptDataEscapedDashDash { // from class: org.jsoup.parser.TokeniserState.24
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            if (c59950zsf.AhwBna()) {
                c59953zsi.AEQbTJ(this);
                c59953zsi.KWHzl(TokeniserState.Data);
                return;
            }
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == 0) {
                c59953zsi.OLrzqt(this);
                c59953zsi.OLrzqt((char) 65533);
                c59953zsi.KWHzl(TokeniserState.ScriptDataEscaped);
            } else {
                if (cAEQbTJ == '-') {
                    c59953zsi.OLrzqt(cAEQbTJ);
                    return;
                }
                if (cAEQbTJ == '<') {
                    c59953zsi.KWHzl(TokeniserState.ScriptDataEscapedLessthanSign);
                } else if (cAEQbTJ == '>') {
                    c59953zsi.OLrzqt(cAEQbTJ);
                    c59953zsi.KWHzl(TokeniserState.ScriptData);
                } else {
                    c59953zsi.OLrzqt(cAEQbTJ);
                    c59953zsi.KWHzl(TokeniserState.ScriptDataEscaped);
                }
            }
        }
    },
    ScriptDataEscapedLessthanSign { // from class: org.jsoup.parser.TokeniserState.25
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            if (c59950zsf.DbNXlk()) {
                c59953zsi.copydefault();
                c59953zsi.OLrzqt.append(Character.toLowerCase(c59950zsf.valueOf()));
                c59953zsi.copydefault("<" + c59950zsf.valueOf());
                c59953zsi.EZpvd(TokeniserState.ScriptDataDoubleEscapeStart);
                return;
            }
            if (c59950zsf.AEQbTJ(JsonPointer.SEPARATOR)) {
                c59953zsi.copydefault();
                c59953zsi.EZpvd(TokeniserState.ScriptDataEscapedEndTagOpen);
            } else {
                c59953zsi.OLrzqt('<');
                c59953zsi.KWHzl(TokeniserState.ScriptDataEscaped);
            }
        }
    },
    ScriptDataEscapedEndTagOpen { // from class: org.jsoup.parser.TokeniserState.26
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            if (c59950zsf.DbNXlk()) {
                c59953zsi.AEQbTJ(false);
                c59953zsi.DbNXlk.KWHzl(Character.toLowerCase(c59950zsf.valueOf()));
                c59953zsi.OLrzqt.append(c59950zsf.valueOf());
                c59953zsi.EZpvd(TokeniserState.ScriptDataEscapedEndTagName);
                return;
            }
            c59953zsi.copydefault("</");
            c59953zsi.KWHzl(TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataEscapedEndTagName { // from class: org.jsoup.parser.TokeniserState.27
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            if (c59950zsf.DbNXlk()) {
                String strOLrzqt = c59950zsf.OLrzqt();
                c59953zsi.DbNXlk.EZpvd(strOLrzqt.toLowerCase());
                c59953zsi.OLrzqt.append(strOLrzqt);
                return;
            }
            if (c59953zsi.AhwBna() && !c59950zsf.AhwBna()) {
                char cAEQbTJ = c59950zsf.AEQbTJ();
                if (cAEQbTJ == '\t' || cAEQbTJ == '\n' || cAEQbTJ == '\f' || cAEQbTJ == '\r' || cAEQbTJ == ' ') {
                    c59953zsi.KWHzl(TokeniserState.BeforeAttributeName);
                    return;
                }
                if (cAEQbTJ == '/') {
                    c59953zsi.KWHzl(TokeniserState.SelfClosingStartTag);
                    return;
                } else if (cAEQbTJ == '>') {
                    c59953zsi.AYXKKw();
                    c59953zsi.KWHzl(TokeniserState.Data);
                    return;
                } else {
                    c59953zsi.OLrzqt.append(cAEQbTJ);
                    anythingElse(c59953zsi, c59950zsf);
                    return;
                }
            }
            anythingElse(c59953zsi, c59950zsf);
        }

        private void anythingElse(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            c59953zsi.copydefault("</" + c59953zsi.OLrzqt.toString());
            c59953zsi.KWHzl(TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscapeStart { // from class: org.jsoup.parser.TokeniserState.28
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            if (c59950zsf.DbNXlk()) {
                String strOLrzqt = c59950zsf.OLrzqt();
                c59953zsi.OLrzqt.append(strOLrzqt.toLowerCase());
                c59953zsi.copydefault(strOLrzqt);
                return;
            }
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == '\t' || cAEQbTJ == '\n' || cAEQbTJ == '\f' || cAEQbTJ == '\r' || cAEQbTJ == ' ' || cAEQbTJ == '/' || cAEQbTJ == '>') {
                if (c59953zsi.OLrzqt.toString().equals("script")) {
                    c59953zsi.KWHzl(TokeniserState.ScriptDataDoubleEscaped);
                } else {
                    c59953zsi.KWHzl(TokeniserState.ScriptDataEscaped);
                }
                c59953zsi.OLrzqt(cAEQbTJ);
                return;
            }
            c59950zsf.values();
            c59953zsi.KWHzl(TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscaped { // from class: org.jsoup.parser.TokeniserState.29
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cValueOf = c59950zsf.valueOf();
            if (cValueOf == 0) {
                c59953zsi.OLrzqt(this);
                c59950zsf.copydefault();
                c59953zsi.OLrzqt((char) 65533);
            } else if (cValueOf == '-') {
                c59953zsi.OLrzqt(cValueOf);
                c59953zsi.EZpvd(TokeniserState.ScriptDataDoubleEscapedDash);
            } else if (cValueOf == '<') {
                c59953zsi.OLrzqt(cValueOf);
                c59953zsi.EZpvd(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
            } else if (cValueOf == 65535) {
                c59953zsi.AEQbTJ(this);
                c59953zsi.KWHzl(TokeniserState.Data);
            } else {
                c59953zsi.copydefault(c59950zsf.EZpvd('-', '<', 0));
            }
        }
    },
    ScriptDataDoubleEscapedDash { // from class: org.jsoup.parser.TokeniserState.30
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == 0) {
                c59953zsi.OLrzqt(this);
                c59953zsi.OLrzqt((char) 65533);
                c59953zsi.KWHzl(TokeniserState.ScriptDataDoubleEscaped);
            } else if (cAEQbTJ == '-') {
                c59953zsi.OLrzqt(cAEQbTJ);
                c59953zsi.KWHzl(TokeniserState.ScriptDataDoubleEscapedDashDash);
            } else if (cAEQbTJ == '<') {
                c59953zsi.OLrzqt(cAEQbTJ);
                c59953zsi.KWHzl(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
            } else if (cAEQbTJ == 65535) {
                c59953zsi.AEQbTJ(this);
                c59953zsi.KWHzl(TokeniserState.Data);
            } else {
                c59953zsi.OLrzqt(cAEQbTJ);
                c59953zsi.KWHzl(TokeniserState.ScriptDataDoubleEscaped);
            }
        }
    },
    ScriptDataDoubleEscapedDashDash { // from class: org.jsoup.parser.TokeniserState.31
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == 0) {
                c59953zsi.OLrzqt(this);
                c59953zsi.OLrzqt((char) 65533);
                c59953zsi.KWHzl(TokeniserState.ScriptDataDoubleEscaped);
                return;
            }
            if (cAEQbTJ == '-') {
                c59953zsi.OLrzqt(cAEQbTJ);
                return;
            }
            if (cAEQbTJ == '<') {
                c59953zsi.OLrzqt(cAEQbTJ);
                c59953zsi.KWHzl(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
            } else if (cAEQbTJ == '>') {
                c59953zsi.OLrzqt(cAEQbTJ);
                c59953zsi.KWHzl(TokeniserState.ScriptData);
            } else if (cAEQbTJ == 65535) {
                c59953zsi.AEQbTJ(this);
                c59953zsi.KWHzl(TokeniserState.Data);
            } else {
                c59953zsi.OLrzqt(cAEQbTJ);
                c59953zsi.KWHzl(TokeniserState.ScriptDataDoubleEscaped);
            }
        }
    },
    ScriptDataDoubleEscapedLessthanSign { // from class: org.jsoup.parser.TokeniserState.32
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            if (c59950zsf.AEQbTJ(JsonPointer.SEPARATOR)) {
                c59953zsi.OLrzqt(JsonPointer.SEPARATOR);
                c59953zsi.copydefault();
                c59953zsi.EZpvd(TokeniserState.ScriptDataDoubleEscapeEnd);
                return;
            }
            c59953zsi.KWHzl(TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    ScriptDataDoubleEscapeEnd { // from class: org.jsoup.parser.TokeniserState.33
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            if (c59950zsf.DbNXlk()) {
                String strOLrzqt = c59950zsf.OLrzqt();
                c59953zsi.OLrzqt.append(strOLrzqt.toLowerCase());
                c59953zsi.copydefault(strOLrzqt);
                return;
            }
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == '\t' || cAEQbTJ == '\n' || cAEQbTJ == '\f' || cAEQbTJ == '\r' || cAEQbTJ == ' ' || cAEQbTJ == '/' || cAEQbTJ == '>') {
                if (c59953zsi.OLrzqt.toString().equals("script")) {
                    c59953zsi.KWHzl(TokeniserState.ScriptDataEscaped);
                } else {
                    c59953zsi.KWHzl(TokeniserState.ScriptDataDoubleEscaped);
                }
                c59953zsi.OLrzqt(cAEQbTJ);
                return;
            }
            c59950zsf.values();
            c59953zsi.KWHzl(TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    BeforeAttributeName { // from class: org.jsoup.parser.TokeniserState.34
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == 0) {
                c59953zsi.OLrzqt(this);
                c59953zsi.DbNXlk.fARcdN();
                c59950zsf.values();
                c59953zsi.KWHzl(TokeniserState.AttributeName);
                return;
            }
            if (cAEQbTJ != ' ') {
                if (cAEQbTJ != '\"' && cAEQbTJ != '\'') {
                    if (cAEQbTJ == '/') {
                        c59953zsi.KWHzl(TokeniserState.SelfClosingStartTag);
                        return;
                    }
                    if (cAEQbTJ == 65535) {
                        c59953zsi.AEQbTJ(this);
                        c59953zsi.KWHzl(TokeniserState.Data);
                        return;
                    }
                    if (cAEQbTJ == '\t' || cAEQbTJ == '\n' || cAEQbTJ == '\f' || cAEQbTJ == '\r') {
                        return;
                    }
                    switch (cAEQbTJ) {
                        case '<':
                        case '=':
                            break;
                        case '>':
                            c59953zsi.AYXKKw();
                            c59953zsi.KWHzl(TokeniserState.Data);
                            break;
                        default:
                            c59953zsi.DbNXlk.fARcdN();
                            c59950zsf.values();
                            c59953zsi.KWHzl(TokeniserState.AttributeName);
                            break;
                    }
                    return;
                }
                c59953zsi.OLrzqt(this);
                c59953zsi.DbNXlk.fARcdN();
                c59953zsi.DbNXlk.OLrzqt(cAEQbTJ);
                c59953zsi.KWHzl(TokeniserState.AttributeName);
            }
        }
    },
    AttributeName { // from class: org.jsoup.parser.TokeniserState.35
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            c59953zsi.DbNXlk.OLrzqt(c59950zsf.EZpvd('\t', '\n', '\r', '\f', ' ', JsonPointer.SEPARATOR, '=', '>', 0, '\"', '\'', '<').toLowerCase());
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ != 0) {
                if (cAEQbTJ != ' ') {
                    if (cAEQbTJ != '\"' && cAEQbTJ != '\'') {
                        if (cAEQbTJ == '/') {
                            c59953zsi.KWHzl(TokeniserState.SelfClosingStartTag);
                            return;
                        }
                        if (cAEQbTJ == 65535) {
                            c59953zsi.AEQbTJ(this);
                            c59953zsi.KWHzl(TokeniserState.Data);
                            return;
                        } else if (cAEQbTJ != '\t' && cAEQbTJ != '\n' && cAEQbTJ != '\f' && cAEQbTJ != '\r') {
                            switch (cAEQbTJ) {
                                case '=':
                                    c59953zsi.KWHzl(TokeniserState.BeforeAttributeValue);
                                    break;
                                case '>':
                                    c59953zsi.AYXKKw();
                                    c59953zsi.KWHzl(TokeniserState.Data);
                                    break;
                            }
                        }
                    }
                    c59953zsi.OLrzqt(this);
                    c59953zsi.DbNXlk.OLrzqt(cAEQbTJ);
                    return;
                }
                c59953zsi.KWHzl(TokeniserState.AfterAttributeName);
                return;
            }
            c59953zsi.OLrzqt(this);
            c59953zsi.DbNXlk.OLrzqt((char) 65533);
        }
    },
    AfterAttributeName { // from class: org.jsoup.parser.TokeniserState.36
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == 0) {
                c59953zsi.OLrzqt(this);
                c59953zsi.DbNXlk.OLrzqt((char) 65533);
                c59953zsi.KWHzl(TokeniserState.AttributeName);
                return;
            }
            if (cAEQbTJ != ' ') {
                if (cAEQbTJ != '\"' && cAEQbTJ != '\'') {
                    if (cAEQbTJ == '/') {
                        c59953zsi.KWHzl(TokeniserState.SelfClosingStartTag);
                        return;
                    }
                    if (cAEQbTJ == 65535) {
                        c59953zsi.AEQbTJ(this);
                        c59953zsi.KWHzl(TokeniserState.Data);
                        return;
                    }
                    if (cAEQbTJ == '\t' || cAEQbTJ == '\n' || cAEQbTJ == '\f' || cAEQbTJ == '\r') {
                        return;
                    }
                    switch (cAEQbTJ) {
                        case '<':
                            break;
                        case '=':
                            c59953zsi.KWHzl(TokeniserState.BeforeAttributeValue);
                            break;
                        case '>':
                            c59953zsi.AYXKKw();
                            c59953zsi.KWHzl(TokeniserState.Data);
                            break;
                        default:
                            c59953zsi.DbNXlk.fARcdN();
                            c59950zsf.values();
                            c59953zsi.KWHzl(TokeniserState.AttributeName);
                            break;
                    }
                    return;
                }
                c59953zsi.OLrzqt(this);
                c59953zsi.DbNXlk.fARcdN();
                c59953zsi.DbNXlk.OLrzqt(cAEQbTJ);
                c59953zsi.KWHzl(TokeniserState.AttributeName);
            }
        }
    },
    BeforeAttributeValue { // from class: org.jsoup.parser.TokeniserState.37
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == 0) {
                c59953zsi.OLrzqt(this);
                c59953zsi.DbNXlk.AEQbTJ((char) 65533);
                c59953zsi.KWHzl(TokeniserState.AttributeValue_unquoted);
                return;
            }
            if (cAEQbTJ != ' ') {
                if (cAEQbTJ == '\"') {
                    c59953zsi.KWHzl(TokeniserState.AttributeValue_doubleQuoted);
                    return;
                }
                if (cAEQbTJ != '`') {
                    if (cAEQbTJ == 65535) {
                        c59953zsi.AEQbTJ(this);
                        c59953zsi.KWHzl(TokeniserState.Data);
                        return;
                    }
                    if (cAEQbTJ == '\t' || cAEQbTJ == '\n' || cAEQbTJ == '\f' || cAEQbTJ == '\r') {
                        return;
                    }
                    if (cAEQbTJ == '&') {
                        c59950zsf.values();
                        c59953zsi.KWHzl(TokeniserState.AttributeValue_unquoted);
                        return;
                    }
                    if (cAEQbTJ == '\'') {
                        c59953zsi.KWHzl(TokeniserState.AttributeValue_singleQuoted);
                        return;
                    }
                    switch (cAEQbTJ) {
                        case '<':
                        case '=':
                            break;
                        case '>':
                            c59953zsi.OLrzqt(this);
                            c59953zsi.AYXKKw();
                            c59953zsi.KWHzl(TokeniserState.Data);
                            break;
                        default:
                            c59950zsf.values();
                            c59953zsi.KWHzl(TokeniserState.AttributeValue_unquoted);
                            break;
                    }
                    return;
                }
                c59953zsi.OLrzqt(this);
                c59953zsi.DbNXlk.AEQbTJ(cAEQbTJ);
                c59953zsi.KWHzl(TokeniserState.AttributeValue_unquoted);
            }
        }
    },
    AttributeValue_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.38
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            String strEZpvd = c59950zsf.EZpvd('\"', '&', 0);
            if (strEZpvd.length() > 0) {
                c59953zsi.DbNXlk.KWHzl(strEZpvd);
            }
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == 0) {
                c59953zsi.OLrzqt(this);
                c59953zsi.DbNXlk.AEQbTJ((char) 65533);
                return;
            }
            if (cAEQbTJ == '\"') {
                c59953zsi.KWHzl(TokeniserState.AfterAttributeValue_quoted);
                return;
            }
            if (cAEQbTJ != '&') {
                if (cAEQbTJ != 65535) {
                    return;
                }
                c59953zsi.AEQbTJ(this);
                c59953zsi.KWHzl(TokeniserState.Data);
                return;
            }
            char[] cArrEZpvd = c59953zsi.EZpvd('\"', true);
            if (cArrEZpvd != null) {
                c59953zsi.DbNXlk.EZpvd(cArrEZpvd);
            } else {
                c59953zsi.DbNXlk.AEQbTJ('&');
            }
        }
    },
    AttributeValue_singleQuoted { // from class: org.jsoup.parser.TokeniserState.39
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            String strEZpvd = c59950zsf.EZpvd('\'', '&', 0);
            if (strEZpvd.length() > 0) {
                c59953zsi.DbNXlk.KWHzl(strEZpvd);
            }
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == 0) {
                c59953zsi.OLrzqt(this);
                c59953zsi.DbNXlk.AEQbTJ((char) 65533);
                return;
            }
            if (cAEQbTJ == 65535) {
                c59953zsi.AEQbTJ(this);
                c59953zsi.KWHzl(TokeniserState.Data);
            } else if (cAEQbTJ != '&') {
                if (cAEQbTJ != '\'') {
                    return;
                }
                c59953zsi.KWHzl(TokeniserState.AfterAttributeValue_quoted);
            } else {
                char[] cArrEZpvd = c59953zsi.EZpvd('\'', true);
                if (cArrEZpvd != null) {
                    c59953zsi.DbNXlk.EZpvd(cArrEZpvd);
                } else {
                    c59953zsi.DbNXlk.AEQbTJ('&');
                }
            }
        }
    },
    AttributeValue_unquoted { // from class: org.jsoup.parser.TokeniserState.40
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            String strEZpvd = c59950zsf.EZpvd('\t', '\n', '\r', '\f', ' ', '&', '>', 0, '\"', '\'', '<', '=', '`');
            if (strEZpvd.length() > 0) {
                c59953zsi.DbNXlk.KWHzl(strEZpvd);
            }
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ != 0) {
                if (cAEQbTJ != ' ') {
                    if (cAEQbTJ != '\"' && cAEQbTJ != '`') {
                        if (cAEQbTJ == 65535) {
                            c59953zsi.AEQbTJ(this);
                            c59953zsi.KWHzl(TokeniserState.Data);
                            return;
                        }
                        if (cAEQbTJ != '\t' && cAEQbTJ != '\n' && cAEQbTJ != '\f' && cAEQbTJ != '\r') {
                            if (cAEQbTJ == '&') {
                                char[] cArrEZpvd = c59953zsi.EZpvd('>', true);
                                if (cArrEZpvd != null) {
                                    c59953zsi.DbNXlk.EZpvd(cArrEZpvd);
                                    return;
                                } else {
                                    c59953zsi.DbNXlk.AEQbTJ('&');
                                    return;
                                }
                            }
                            if (cAEQbTJ != '\'') {
                                switch (cAEQbTJ) {
                                    case '>':
                                        c59953zsi.AYXKKw();
                                        c59953zsi.KWHzl(TokeniserState.Data);
                                        break;
                                }
                            }
                        }
                    }
                    c59953zsi.OLrzqt(this);
                    c59953zsi.DbNXlk.AEQbTJ(cAEQbTJ);
                    return;
                }
                c59953zsi.KWHzl(TokeniserState.BeforeAttributeName);
                return;
            }
            c59953zsi.OLrzqt(this);
            c59953zsi.DbNXlk.AEQbTJ((char) 65533);
        }
    },
    AfterAttributeValue_quoted { // from class: org.jsoup.parser.TokeniserState.41
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == '\t' || cAEQbTJ == '\n' || cAEQbTJ == '\f' || cAEQbTJ == '\r' || cAEQbTJ == ' ') {
                c59953zsi.KWHzl(TokeniserState.BeforeAttributeName);
                return;
            }
            if (cAEQbTJ == '/') {
                c59953zsi.KWHzl(TokeniserState.SelfClosingStartTag);
                return;
            }
            if (cAEQbTJ == '>') {
                c59953zsi.AYXKKw();
                c59953zsi.KWHzl(TokeniserState.Data);
            } else if (cAEQbTJ == 65535) {
                c59953zsi.AEQbTJ(this);
                c59953zsi.KWHzl(TokeniserState.Data);
            } else {
                c59953zsi.OLrzqt(this);
                c59950zsf.values();
                c59953zsi.KWHzl(TokeniserState.BeforeAttributeName);
            }
        }
    },
    SelfClosingStartTag { // from class: org.jsoup.parser.TokeniserState.42
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == '>') {
                c59953zsi.DbNXlk.EZpvd = true;
                c59953zsi.AYXKKw();
                c59953zsi.KWHzl(TokeniserState.Data);
            } else if (cAEQbTJ == 65535) {
                c59953zsi.AEQbTJ(this);
                c59953zsi.KWHzl(TokeniserState.Data);
            } else {
                c59953zsi.OLrzqt(this);
                c59953zsi.KWHzl(TokeniserState.BeforeAttributeName);
            }
        }
    },
    BogusComment { // from class: org.jsoup.parser.TokeniserState.43
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            c59950zsf.values();
            Token.TaskDescription taskDescription = new Token.TaskDescription();
            taskDescription.EZpvd = true;
            taskDescription.AEQbTJ.append(c59950zsf.copydefault('>'));
            c59953zsi.KWHzl(taskDescription);
            c59953zsi.EZpvd(TokeniserState.Data);
        }
    },
    MarkupDeclarationOpen { // from class: org.jsoup.parser.TokeniserState.44
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            if (c59950zsf.OLrzqt("--")) {
                c59953zsi.OLrzqt();
                c59953zsi.KWHzl(TokeniserState.CommentStart);
            } else if (c59950zsf.copydefault("DOCTYPE")) {
                c59953zsi.KWHzl(TokeniserState.Doctype);
            } else if (c59950zsf.OLrzqt("[CDATA[")) {
                c59953zsi.KWHzl(TokeniserState.CdataSection);
            } else {
                c59953zsi.OLrzqt(this);
                c59953zsi.EZpvd(TokeniserState.BogusComment);
            }
        }
    },
    CommentStart { // from class: org.jsoup.parser.TokeniserState.45
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == 0) {
                c59953zsi.OLrzqt(this);
                c59953zsi.AEQbTJ.AEQbTJ.append((char) 65533);
                c59953zsi.KWHzl(TokeniserState.Comment);
                return;
            }
            if (cAEQbTJ == '-') {
                c59953zsi.KWHzl(TokeniserState.CommentStartDash);
                return;
            }
            if (cAEQbTJ == '>') {
                c59953zsi.OLrzqt(this);
                c59953zsi.djBIcL();
                c59953zsi.KWHzl(TokeniserState.Data);
            } else if (cAEQbTJ == 65535) {
                c59953zsi.AEQbTJ(this);
                c59953zsi.djBIcL();
                c59953zsi.KWHzl(TokeniserState.Data);
            } else {
                c59953zsi.AEQbTJ.AEQbTJ.append(cAEQbTJ);
                c59953zsi.KWHzl(TokeniserState.Comment);
            }
        }
    },
    CommentStartDash { // from class: org.jsoup.parser.TokeniserState.46
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == 0) {
                c59953zsi.OLrzqt(this);
                c59953zsi.AEQbTJ.AEQbTJ.append((char) 65533);
                c59953zsi.KWHzl(TokeniserState.Comment);
                return;
            }
            if (cAEQbTJ == '-') {
                c59953zsi.KWHzl(TokeniserState.CommentStartDash);
                return;
            }
            if (cAEQbTJ == '>') {
                c59953zsi.OLrzqt(this);
                c59953zsi.djBIcL();
                c59953zsi.KWHzl(TokeniserState.Data);
            } else if (cAEQbTJ == 65535) {
                c59953zsi.AEQbTJ(this);
                c59953zsi.djBIcL();
                c59953zsi.KWHzl(TokeniserState.Data);
            } else {
                c59953zsi.AEQbTJ.AEQbTJ.append(cAEQbTJ);
                c59953zsi.KWHzl(TokeniserState.Comment);
            }
        }
    },
    Comment { // from class: org.jsoup.parser.TokeniserState.47
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cValueOf = c59950zsf.valueOf();
            if (cValueOf == 0) {
                c59953zsi.OLrzqt(this);
                c59950zsf.copydefault();
                c59953zsi.AEQbTJ.AEQbTJ.append((char) 65533);
            } else if (cValueOf == '-') {
                c59953zsi.EZpvd(TokeniserState.CommentEndDash);
            } else {
                if (cValueOf == 65535) {
                    c59953zsi.AEQbTJ(this);
                    c59953zsi.djBIcL();
                    c59953zsi.KWHzl(TokeniserState.Data);
                    return;
                }
                c59953zsi.AEQbTJ.AEQbTJ.append(c59950zsf.EZpvd('-', 0));
            }
        }
    },
    CommentEndDash { // from class: org.jsoup.parser.TokeniserState.48
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == 0) {
                c59953zsi.OLrzqt(this);
                StringBuilder sb = c59953zsi.AEQbTJ.AEQbTJ;
                sb.append('-');
                sb.append((char) 65533);
                c59953zsi.KWHzl(TokeniserState.Comment);
                return;
            }
            if (cAEQbTJ == '-') {
                c59953zsi.KWHzl(TokeniserState.CommentEnd);
                return;
            }
            if (cAEQbTJ == 65535) {
                c59953zsi.AEQbTJ(this);
                c59953zsi.djBIcL();
                c59953zsi.KWHzl(TokeniserState.Data);
            } else {
                StringBuilder sb2 = c59953zsi.AEQbTJ.AEQbTJ;
                sb2.append('-');
                sb2.append(cAEQbTJ);
                c59953zsi.KWHzl(TokeniserState.Comment);
            }
        }
    },
    CommentEnd { // from class: org.jsoup.parser.TokeniserState.49
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == 0) {
                c59953zsi.OLrzqt(this);
                StringBuilder sb = c59953zsi.AEQbTJ.AEQbTJ;
                sb.append("--");
                sb.append((char) 65533);
                c59953zsi.KWHzl(TokeniserState.Comment);
                return;
            }
            if (cAEQbTJ == '!') {
                c59953zsi.OLrzqt(this);
                c59953zsi.KWHzl(TokeniserState.CommentEndBang);
                return;
            }
            if (cAEQbTJ == '-') {
                c59953zsi.OLrzqt(this);
                c59953zsi.AEQbTJ.AEQbTJ.append('-');
                return;
            }
            if (cAEQbTJ == '>') {
                c59953zsi.djBIcL();
                c59953zsi.KWHzl(TokeniserState.Data);
            } else if (cAEQbTJ == 65535) {
                c59953zsi.AEQbTJ(this);
                c59953zsi.djBIcL();
                c59953zsi.KWHzl(TokeniserState.Data);
            } else {
                c59953zsi.OLrzqt(this);
                StringBuilder sb2 = c59953zsi.AEQbTJ.AEQbTJ;
                sb2.append("--");
                sb2.append(cAEQbTJ);
                c59953zsi.KWHzl(TokeniserState.Comment);
            }
        }
    },
    CommentEndBang { // from class: org.jsoup.parser.TokeniserState.50
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == 0) {
                c59953zsi.OLrzqt(this);
                StringBuilder sb = c59953zsi.AEQbTJ.AEQbTJ;
                sb.append("--!");
                sb.append((char) 65533);
                c59953zsi.KWHzl(TokeniserState.Comment);
                return;
            }
            if (cAEQbTJ == '-') {
                c59953zsi.AEQbTJ.AEQbTJ.append("--!");
                c59953zsi.KWHzl(TokeniserState.CommentEndDash);
                return;
            }
            if (cAEQbTJ == '>') {
                c59953zsi.djBIcL();
                c59953zsi.KWHzl(TokeniserState.Data);
            } else if (cAEQbTJ == 65535) {
                c59953zsi.AEQbTJ(this);
                c59953zsi.djBIcL();
                c59953zsi.KWHzl(TokeniserState.Data);
            } else {
                StringBuilder sb2 = c59953zsi.AEQbTJ.AEQbTJ;
                sb2.append("--!");
                sb2.append(cAEQbTJ);
                c59953zsi.KWHzl(TokeniserState.Comment);
            }
        }
    },
    Doctype { // from class: org.jsoup.parser.TokeniserState.51
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == '\t' || cAEQbTJ == '\n' || cAEQbTJ == '\f' || cAEQbTJ == '\r' || cAEQbTJ == ' ') {
                c59953zsi.KWHzl(TokeniserState.BeforeDoctypeName);
                return;
            }
            if (cAEQbTJ == 65535) {
                c59953zsi.AEQbTJ(this);
                c59953zsi.EZpvd();
                c59953zsi.EZpvd.AEQbTJ = true;
                c59953zsi.valueOf();
                c59953zsi.KWHzl(TokeniserState.Data);
                return;
            }
            c59953zsi.OLrzqt(this);
            c59953zsi.KWHzl(TokeniserState.BeforeDoctypeName);
        }
    },
    BeforeDoctypeName { // from class: org.jsoup.parser.TokeniserState.52
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            if (c59950zsf.DbNXlk()) {
                c59953zsi.EZpvd();
                c59953zsi.KWHzl(TokeniserState.DoctypeName);
                return;
            }
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == 0) {
                c59953zsi.OLrzqt(this);
                c59953zsi.EZpvd.OLrzqt.append((char) 65533);
                c59953zsi.KWHzl(TokeniserState.DoctypeName);
                return;
            }
            if (cAEQbTJ != ' ') {
                if (cAEQbTJ == 65535) {
                    c59953zsi.AEQbTJ(this);
                    c59953zsi.EZpvd();
                    c59953zsi.EZpvd.AEQbTJ = true;
                    c59953zsi.valueOf();
                    c59953zsi.KWHzl(TokeniserState.Data);
                    return;
                }
                if (cAEQbTJ == '\t' || cAEQbTJ == '\n' || cAEQbTJ == '\f' || cAEQbTJ == '\r') {
                    return;
                }
                c59953zsi.EZpvd();
                c59953zsi.EZpvd.OLrzqt.append(cAEQbTJ);
                c59953zsi.KWHzl(TokeniserState.DoctypeName);
            }
        }
    },
    DoctypeName { // from class: org.jsoup.parser.TokeniserState.53
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            if (c59950zsf.DbNXlk()) {
                c59953zsi.EZpvd.OLrzqt.append(c59950zsf.OLrzqt().toLowerCase());
                return;
            }
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ != 0) {
                if (cAEQbTJ != ' ') {
                    if (cAEQbTJ == '>') {
                        c59953zsi.valueOf();
                        c59953zsi.KWHzl(TokeniserState.Data);
                        return;
                    }
                    if (cAEQbTJ == 65535) {
                        c59953zsi.AEQbTJ(this);
                        c59953zsi.EZpvd.AEQbTJ = true;
                        c59953zsi.valueOf();
                        c59953zsi.KWHzl(TokeniserState.Data);
                        return;
                    }
                    if (cAEQbTJ != '\t' && cAEQbTJ != '\n' && cAEQbTJ != '\f' && cAEQbTJ != '\r') {
                        c59953zsi.EZpvd.OLrzqt.append(cAEQbTJ);
                        return;
                    }
                }
                c59953zsi.KWHzl(TokeniserState.AfterDoctypeName);
                return;
            }
            c59953zsi.OLrzqt(this);
            c59953zsi.EZpvd.OLrzqt.append((char) 65533);
        }
    },
    AfterDoctypeName { // from class: org.jsoup.parser.TokeniserState.54
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            if (c59950zsf.AhwBna()) {
                c59953zsi.AEQbTJ(this);
                c59953zsi.EZpvd.AEQbTJ = true;
                c59953zsi.valueOf();
                c59953zsi.KWHzl(TokeniserState.Data);
                return;
            }
            if (c59950zsf.copydefault('\t', '\n', '\r', '\f', ' ')) {
                c59950zsf.copydefault();
                return;
            }
            if (c59950zsf.AEQbTJ('>')) {
                c59953zsi.valueOf();
                c59953zsi.EZpvd(TokeniserState.Data);
            } else if (c59950zsf.copydefault("PUBLIC")) {
                c59953zsi.KWHzl(TokeniserState.AfterDoctypePublicKeyword);
            } else {
                if (c59950zsf.copydefault("SYSTEM")) {
                    c59953zsi.KWHzl(TokeniserState.AfterDoctypeSystemKeyword);
                    return;
                }
                c59953zsi.OLrzqt(this);
                c59953zsi.EZpvd.AEQbTJ = true;
                c59953zsi.EZpvd(TokeniserState.BogusDoctype);
            }
        }
    },
    AfterDoctypePublicKeyword { // from class: org.jsoup.parser.TokeniserState.55
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == '\t' || cAEQbTJ == '\n' || cAEQbTJ == '\f' || cAEQbTJ == '\r' || cAEQbTJ == ' ') {
                c59953zsi.KWHzl(TokeniserState.BeforeDoctypePublicIdentifier);
                return;
            }
            if (cAEQbTJ == '\"') {
                c59953zsi.OLrzqt(this);
                c59953zsi.KWHzl(TokeniserState.DoctypePublicIdentifier_doubleQuoted);
                return;
            }
            if (cAEQbTJ == '\'') {
                c59953zsi.OLrzqt(this);
                c59953zsi.KWHzl(TokeniserState.DoctypePublicIdentifier_singleQuoted);
                return;
            }
            if (cAEQbTJ == '>') {
                c59953zsi.OLrzqt(this);
                c59953zsi.EZpvd.AEQbTJ = true;
                c59953zsi.valueOf();
                c59953zsi.KWHzl(TokeniserState.Data);
                return;
            }
            if (cAEQbTJ == 65535) {
                c59953zsi.AEQbTJ(this);
                c59953zsi.EZpvd.AEQbTJ = true;
                c59953zsi.valueOf();
                c59953zsi.KWHzl(TokeniserState.Data);
                return;
            }
            c59953zsi.OLrzqt(this);
            c59953zsi.EZpvd.AEQbTJ = true;
            c59953zsi.KWHzl(TokeniserState.BogusDoctype);
        }
    },
    BeforeDoctypePublicIdentifier { // from class: org.jsoup.parser.TokeniserState.56
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == '\t' || cAEQbTJ == '\n' || cAEQbTJ == '\f' || cAEQbTJ == '\r' || cAEQbTJ == ' ') {
                return;
            }
            if (cAEQbTJ == '\"') {
                c59953zsi.KWHzl(TokeniserState.DoctypePublicIdentifier_doubleQuoted);
                return;
            }
            if (cAEQbTJ == '\'') {
                c59953zsi.KWHzl(TokeniserState.DoctypePublicIdentifier_singleQuoted);
                return;
            }
            if (cAEQbTJ == '>') {
                c59953zsi.OLrzqt(this);
                c59953zsi.EZpvd.AEQbTJ = true;
                c59953zsi.valueOf();
                c59953zsi.KWHzl(TokeniserState.Data);
                return;
            }
            if (cAEQbTJ == 65535) {
                c59953zsi.AEQbTJ(this);
                c59953zsi.EZpvd.AEQbTJ = true;
                c59953zsi.valueOf();
                c59953zsi.KWHzl(TokeniserState.Data);
                return;
            }
            c59953zsi.OLrzqt(this);
            c59953zsi.EZpvd.AEQbTJ = true;
            c59953zsi.KWHzl(TokeniserState.BogusDoctype);
        }
    },
    DoctypePublicIdentifier_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.57
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == 0) {
                c59953zsi.OLrzqt(this);
                c59953zsi.EZpvd.KWHzl.append((char) 65533);
                return;
            }
            if (cAEQbTJ == '\"') {
                c59953zsi.KWHzl(TokeniserState.AfterDoctypePublicIdentifier);
                return;
            }
            if (cAEQbTJ == '>') {
                c59953zsi.OLrzqt(this);
                c59953zsi.EZpvd.AEQbTJ = true;
                c59953zsi.valueOf();
                c59953zsi.KWHzl(TokeniserState.Data);
                return;
            }
            if (cAEQbTJ == 65535) {
                c59953zsi.AEQbTJ(this);
                c59953zsi.EZpvd.AEQbTJ = true;
                c59953zsi.valueOf();
                c59953zsi.KWHzl(TokeniserState.Data);
                return;
            }
            c59953zsi.EZpvd.KWHzl.append(cAEQbTJ);
        }
    },
    DoctypePublicIdentifier_singleQuoted { // from class: org.jsoup.parser.TokeniserState.58
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == 0) {
                c59953zsi.OLrzqt(this);
                c59953zsi.EZpvd.KWHzl.append((char) 65533);
                return;
            }
            if (cAEQbTJ == '\'') {
                c59953zsi.KWHzl(TokeniserState.AfterDoctypePublicIdentifier);
                return;
            }
            if (cAEQbTJ == '>') {
                c59953zsi.OLrzqt(this);
                c59953zsi.EZpvd.AEQbTJ = true;
                c59953zsi.valueOf();
                c59953zsi.KWHzl(TokeniserState.Data);
                return;
            }
            if (cAEQbTJ == 65535) {
                c59953zsi.AEQbTJ(this);
                c59953zsi.EZpvd.AEQbTJ = true;
                c59953zsi.valueOf();
                c59953zsi.KWHzl(TokeniserState.Data);
                return;
            }
            c59953zsi.EZpvd.KWHzl.append(cAEQbTJ);
        }
    },
    AfterDoctypePublicIdentifier { // from class: org.jsoup.parser.TokeniserState.59
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == '\t' || cAEQbTJ == '\n' || cAEQbTJ == '\f' || cAEQbTJ == '\r' || cAEQbTJ == ' ') {
                c59953zsi.KWHzl(TokeniserState.BetweenDoctypePublicAndSystemIdentifiers);
                return;
            }
            if (cAEQbTJ == '\"') {
                c59953zsi.OLrzqt(this);
                c59953zsi.KWHzl(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            if (cAEQbTJ == '\'') {
                c59953zsi.OLrzqt(this);
                c59953zsi.KWHzl(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                return;
            }
            if (cAEQbTJ == '>') {
                c59953zsi.valueOf();
                c59953zsi.KWHzl(TokeniserState.Data);
            } else {
                if (cAEQbTJ == 65535) {
                    c59953zsi.AEQbTJ(this);
                    c59953zsi.EZpvd.AEQbTJ = true;
                    c59953zsi.valueOf();
                    c59953zsi.KWHzl(TokeniserState.Data);
                    return;
                }
                c59953zsi.OLrzqt(this);
                c59953zsi.EZpvd.AEQbTJ = true;
                c59953zsi.KWHzl(TokeniserState.BogusDoctype);
            }
        }
    },
    BetweenDoctypePublicAndSystemIdentifiers { // from class: org.jsoup.parser.TokeniserState.60
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == '\t' || cAEQbTJ == '\n' || cAEQbTJ == '\f' || cAEQbTJ == '\r' || cAEQbTJ == ' ') {
                return;
            }
            if (cAEQbTJ == '\"') {
                c59953zsi.OLrzqt(this);
                c59953zsi.KWHzl(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            if (cAEQbTJ == '\'') {
                c59953zsi.OLrzqt(this);
                c59953zsi.KWHzl(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                return;
            }
            if (cAEQbTJ == '>') {
                c59953zsi.valueOf();
                c59953zsi.KWHzl(TokeniserState.Data);
            } else {
                if (cAEQbTJ == 65535) {
                    c59953zsi.AEQbTJ(this);
                    c59953zsi.EZpvd.AEQbTJ = true;
                    c59953zsi.valueOf();
                    c59953zsi.KWHzl(TokeniserState.Data);
                    return;
                }
                c59953zsi.OLrzqt(this);
                c59953zsi.EZpvd.AEQbTJ = true;
                c59953zsi.KWHzl(TokeniserState.BogusDoctype);
            }
        }
    },
    AfterDoctypeSystemKeyword { // from class: org.jsoup.parser.TokeniserState.61
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == '\t' || cAEQbTJ == '\n' || cAEQbTJ == '\f' || cAEQbTJ == '\r' || cAEQbTJ == ' ') {
                c59953zsi.KWHzl(TokeniserState.BeforeDoctypeSystemIdentifier);
                return;
            }
            if (cAEQbTJ == '\"') {
                c59953zsi.OLrzqt(this);
                c59953zsi.KWHzl(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            if (cAEQbTJ == '\'') {
                c59953zsi.OLrzqt(this);
                c59953zsi.KWHzl(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                return;
            }
            if (cAEQbTJ == '>') {
                c59953zsi.OLrzqt(this);
                c59953zsi.EZpvd.AEQbTJ = true;
                c59953zsi.valueOf();
                c59953zsi.KWHzl(TokeniserState.Data);
                return;
            }
            if (cAEQbTJ == 65535) {
                c59953zsi.AEQbTJ(this);
                c59953zsi.EZpvd.AEQbTJ = true;
                c59953zsi.valueOf();
                c59953zsi.KWHzl(TokeniserState.Data);
                return;
            }
            c59953zsi.OLrzqt(this);
            c59953zsi.EZpvd.AEQbTJ = true;
            c59953zsi.valueOf();
        }
    },
    BeforeDoctypeSystemIdentifier { // from class: org.jsoup.parser.TokeniserState.62
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == '\t' || cAEQbTJ == '\n' || cAEQbTJ == '\f' || cAEQbTJ == '\r' || cAEQbTJ == ' ') {
                return;
            }
            if (cAEQbTJ == '\"') {
                c59953zsi.KWHzl(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            if (cAEQbTJ == '\'') {
                c59953zsi.KWHzl(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                return;
            }
            if (cAEQbTJ == '>') {
                c59953zsi.OLrzqt(this);
                c59953zsi.EZpvd.AEQbTJ = true;
                c59953zsi.valueOf();
                c59953zsi.KWHzl(TokeniserState.Data);
                return;
            }
            if (cAEQbTJ == 65535) {
                c59953zsi.AEQbTJ(this);
                c59953zsi.EZpvd.AEQbTJ = true;
                c59953zsi.valueOf();
                c59953zsi.KWHzl(TokeniserState.Data);
                return;
            }
            c59953zsi.OLrzqt(this);
            c59953zsi.EZpvd.AEQbTJ = true;
            c59953zsi.KWHzl(TokeniserState.BogusDoctype);
        }
    },
    DoctypeSystemIdentifier_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.63
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == 0) {
                c59953zsi.OLrzqt(this);
                c59953zsi.EZpvd.EZpvd.append((char) 65533);
                return;
            }
            if (cAEQbTJ == '\"') {
                c59953zsi.KWHzl(TokeniserState.AfterDoctypeSystemIdentifier);
                return;
            }
            if (cAEQbTJ == '>') {
                c59953zsi.OLrzqt(this);
                c59953zsi.EZpvd.AEQbTJ = true;
                c59953zsi.valueOf();
                c59953zsi.KWHzl(TokeniserState.Data);
                return;
            }
            if (cAEQbTJ == 65535) {
                c59953zsi.AEQbTJ(this);
                c59953zsi.EZpvd.AEQbTJ = true;
                c59953zsi.valueOf();
                c59953zsi.KWHzl(TokeniserState.Data);
                return;
            }
            c59953zsi.EZpvd.EZpvd.append(cAEQbTJ);
        }
    },
    DoctypeSystemIdentifier_singleQuoted { // from class: org.jsoup.parser.TokeniserState.64
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == 0) {
                c59953zsi.OLrzqt(this);
                c59953zsi.EZpvd.EZpvd.append((char) 65533);
                return;
            }
            if (cAEQbTJ == '\'') {
                c59953zsi.KWHzl(TokeniserState.AfterDoctypeSystemIdentifier);
                return;
            }
            if (cAEQbTJ == '>') {
                c59953zsi.OLrzqt(this);
                c59953zsi.EZpvd.AEQbTJ = true;
                c59953zsi.valueOf();
                c59953zsi.KWHzl(TokeniserState.Data);
                return;
            }
            if (cAEQbTJ == 65535) {
                c59953zsi.AEQbTJ(this);
                c59953zsi.EZpvd.AEQbTJ = true;
                c59953zsi.valueOf();
                c59953zsi.KWHzl(TokeniserState.Data);
                return;
            }
            c59953zsi.EZpvd.EZpvd.append(cAEQbTJ);
        }
    },
    AfterDoctypeSystemIdentifier { // from class: org.jsoup.parser.TokeniserState.65
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == '\t' || cAEQbTJ == '\n' || cAEQbTJ == '\f' || cAEQbTJ == '\r' || cAEQbTJ == ' ') {
                return;
            }
            if (cAEQbTJ == '>') {
                c59953zsi.valueOf();
                c59953zsi.KWHzl(TokeniserState.Data);
            } else {
                if (cAEQbTJ == 65535) {
                    c59953zsi.AEQbTJ(this);
                    c59953zsi.EZpvd.AEQbTJ = true;
                    c59953zsi.valueOf();
                    c59953zsi.KWHzl(TokeniserState.Data);
                    return;
                }
                c59953zsi.OLrzqt(this);
                c59953zsi.KWHzl(TokeniserState.BogusDoctype);
            }
        }
    },
    BogusDoctype { // from class: org.jsoup.parser.TokeniserState.66
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            char cAEQbTJ = c59950zsf.AEQbTJ();
            if (cAEQbTJ == '>') {
                c59953zsi.valueOf();
                c59953zsi.KWHzl(TokeniserState.Data);
            } else {
                if (cAEQbTJ != 65535) {
                    return;
                }
                c59953zsi.valueOf();
                c59953zsi.KWHzl(TokeniserState.Data);
            }
        }
    },
    CdataSection { // from class: org.jsoup.parser.TokeniserState.67
        @Override // org.jsoup.parser.TokeniserState
        public void read(C59953zsi c59953zsi, C59950zsf c59950zsf) {
            c59953zsi.copydefault(c59950zsf.KWHzl("]]>"));
            c59950zsf.OLrzqt("]]>");
            c59953zsi.KWHzl(TokeniserState.Data);
        }
    };

    private static final char eof = 65535;
    private static final char nullChar = 0;
    private static final char replacementChar = 65533;
    private static final String replacementStr = String.valueOf((char) 65533);

    public abstract void read(C59953zsi c59953zsi, C59950zsf c59950zsf);
}
