package org.jsoup.parser;

import o.C59911zrT;
import o.C59912zrU;
import o.C59913zrV;

/* JADX INFO: loaded from: classes20.dex */
public abstract class Token {
    public TokenType copydefault;

    public enum TokenType {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    private Token() {
    }

    public String DbNXlk() {
        return getClass().getSimpleName();
    }

    public static class StateListAnimator extends Token {
        public boolean AEQbTJ;
        public final StringBuilder EZpvd;
        public final StringBuilder KWHzl;
        public final StringBuilder OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean fIwbmz() {
            return this.AEQbTJ;
        }

        public StateListAnimator() {
            super();
            this.OLrzqt = new StringBuilder();
            this.KWHzl = new StringBuilder();
            this.EZpvd = new StringBuilder();
            this.AEQbTJ = false;
            this.copydefault = TokenType.Doctype;
        }

        public String values() {
            return this.OLrzqt.toString();
        }

        public String fetchVPNInfo() {
            return this.KWHzl.toString();
        }

        public String isConnected() {
            return this.EZpvd.toString();
        }
    }

    public static abstract class Fragment extends Token {
        public C59913zrV AEQbTJ;
        public String AhwBna;
        public boolean EZpvd;
        public String KWHzl;
        public StringBuilder OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment AEQbTJ(String str) {
            this.AhwBna = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean fIwbmz() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C59913zrV isConnected() {
            return this.AEQbTJ;
        }

        public Fragment() {
            super();
            this.EZpvd = false;
        }

        public void fARcdN() {
            C59911zrT c59911zrT;
            if (this.AEQbTJ == null) {
                this.AEQbTJ = new C59913zrV();
            }
            String str = this.KWHzl;
            if (str != null) {
                StringBuilder sb = this.OLrzqt;
                if (sb == null) {
                    c59911zrT = new C59911zrT(str, "");
                } else {
                    c59911zrT = new C59911zrT(str, sb.toString());
                }
                this.AEQbTJ.EZpvd(c59911zrT);
            }
            this.KWHzl = null;
            StringBuilder sb2 = this.OLrzqt;
            if (sb2 != null) {
                sb2.delete(0, sb2.length());
            }
        }

        public void fetchVPNInfo() {
            if (this.KWHzl != null) {
                fARcdN();
            }
        }

        public String AuCTel() {
            C59912zrU.copydefault(this.AhwBna.length() == 0);
            return this.AhwBna;
        }

        public void EZpvd(String str) {
            String str2 = this.AhwBna;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.AhwBna = str;
        }

        public void KWHzl(char c) {
            EZpvd(String.valueOf(c));
        }

        public void OLrzqt(String str) {
            String str2 = this.KWHzl;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.KWHzl = str;
        }

        public void OLrzqt(char c) {
            OLrzqt(String.valueOf(c));
        }

        public void KWHzl(String str) {
            values();
            this.OLrzqt.append(str);
        }

        public void AEQbTJ(char c) {
            values();
            this.OLrzqt.append(c);
        }

        public void EZpvd(char[] cArr) {
            values();
            this.OLrzqt.append(cArr);
        }

        public final void values() {
            if (this.OLrzqt == null) {
                this.OLrzqt = new StringBuilder();
            }
        }
    }

    public static class Dialog extends Fragment {
        public Dialog() {
            this.AEQbTJ = new C59913zrV();
            this.copydefault = TokenType.StartTag;
        }

        public Dialog(String str) {
            this();
            this.AhwBna = str;
        }

        public Dialog(String str, C59913zrV c59913zrV) {
            this();
            this.AhwBna = str;
            this.AEQbTJ = c59913zrV;
        }

        public String toString() {
            C59913zrV c59913zrV = this.AEQbTJ;
            if (c59913zrV != null && c59913zrV.OLrzqt() > 0) {
                return "<" + AuCTel() + " " + this.AEQbTJ.toString() + ">";
            }
            return "<" + AuCTel() + ">";
        }
    }

    public static class Application extends Fragment {
        public Application() {
            this.copydefault = TokenType.EndTag;
        }

        public Application(String str) {
            this();
            this.AhwBna = str;
        }

        public String toString() {
            return "</" + AuCTel() + ">";
        }
    }

    public static class TaskDescription extends Token {
        public final StringBuilder AEQbTJ;
        public boolean EZpvd;

        public TaskDescription() {
            super();
            this.AEQbTJ = new StringBuilder();
            this.EZpvd = false;
            this.copydefault = TokenType.Comment;
        }

        public String isConnected() {
            return this.AEQbTJ.toString();
        }

        public String toString() {
            return "<!--" + isConnected() + "-->";
        }
    }

    public static class Activity extends Token {
        public final String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String values() {
            return this.OLrzqt;
        }

        public Activity(String str) {
            super();
            this.copydefault = TokenType.Character;
            this.OLrzqt = str;
        }

        public String toString() {
            return values();
        }
    }

    public static class ActionBar extends Token {
        public ActionBar() {
            super();
            this.copydefault = TokenType.EOF;
        }
    }

    public boolean AYXKKw() {
        return this.copydefault == TokenType.Doctype;
    }

    public StateListAnimator KWHzl() {
        return (StateListAnimator) this;
    }

    public boolean AkhnZx() {
        return this.copydefault == TokenType.StartTag;
    }

    public Dialog OLrzqt() {
        return (Dialog) this;
    }

    public boolean valueOf() {
        return this.copydefault == TokenType.EndTag;
    }

    public Application AEQbTJ() {
        return (Application) this;
    }

    public boolean AhwBna() {
        return this.copydefault == TokenType.Comment;
    }

    public TaskDescription EZpvd() {
        return (TaskDescription) this;
    }

    public boolean gEmmrt() {
        return this.copydefault == TokenType.Character;
    }

    public Activity copydefault() {
        return (Activity) this;
    }

    public boolean djBIcL() {
        return this.copydefault == TokenType.EOF;
    }
}
