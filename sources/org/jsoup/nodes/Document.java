package org.jsoup.nodes;

import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import o.C59946zsb;
import o.C59949zse;
import org.jsoup.nodes.Entities;

/* JADX INFO: loaded from: classes17.dex */
public class Document extends C59946zsb {
    public QuirksMode AEQbTJ;
    public Activity OLrzqt;

    /* JADX INFO: loaded from: classes20.dex */
    public enum QuirksMode {
        noQuirks,
        quirks,
        limitedQuirks
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QuirksMode AYXKKw() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Document KWHzl(QuirksMode quirksMode) {
        this.AEQbTJ = quirksMode;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C59946zsb, o.AbstractC59916zrY
    public String copydefault() {
        return "#document";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Activity djBIcL() {
        return this.OLrzqt;
    }

    public Document(String str) {
        super(C59949zse.EZpvd("#root"), str);
        this.OLrzqt = new Activity();
        this.AEQbTJ = QuirksMode.noQuirks;
    }

    @Override // o.AbstractC59916zrY
    public String EZpvd() {
        return super.valueOf();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Lo/zsb; */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/zrY; */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @Override // o.C59946zsb, o.AbstractC59916zrY
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public Document clone() {
        Document document = (Document) super.clone();
        document.OLrzqt = this.OLrzqt.clone();
        return document;
    }

    public static class Activity implements Cloneable {
        public Entities.EscapeMode AEQbTJ = Entities.EscapeMode.base;
        public int EZpvd;
        public CharsetEncoder KWHzl;
        public Charset OLrzqt;
        public boolean copydefault;
        public boolean djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public CharsetEncoder EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity OLrzqt(boolean z) {
            this.djBIcL = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Entities.EscapeMode copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean djBIcL() {
            return this.djBIcL;
        }

        public Activity() {
            Charset charsetForName = Charset.forName(C.UTF8_NAME);
            this.OLrzqt = charsetForName;
            this.KWHzl = charsetForName.newEncoder();
            this.djBIcL = true;
            this.copydefault = false;
            this.EZpvd = 1;
        }

        public Activity copydefault(Charset charset) {
            this.OLrzqt = charset;
            this.KWHzl = charset.newEncoder();
            return this;
        }

        public Activity KWHzl(String str) {
            copydefault(Charset.forName(str));
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public Activity clone() {
            try {
                Activity activity = (Activity) super.clone();
                activity.KWHzl(this.OLrzqt.name());
                activity.AEQbTJ = Entities.EscapeMode.valueOf(this.AEQbTJ.name());
                return activity;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
