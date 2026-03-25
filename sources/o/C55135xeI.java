package o;

import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.uilab.richtext.htmlspanner.exception.ParsingCancelledException;
import com.okinc.uilab.richtext.htmlspanner.style.Style;
import com.okinc.uilab.richtext.htmlspanner.style.StyleValue;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xeI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55135xeI {
    public int AEQbTJ;
    public InterfaceC55228xfw AYXKKw;
    public boolean AhwBna;
    public boolean EZpvd;
    public int KWHzl;
    public InterfaceC55136xeJ OLrzqt;
    public android.os.Handler copydefault;
    public java.util.Map<java.lang.String, AbstractC55144xeR> djBIcL;
    public int gEmmrt;
    public C59887zpg valueOf;
    public boolean values;

    /* JADX INFO: renamed from: o.xeI$StateListAnimator */
    public interface StateListAnimator {
        boolean AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC55136xeJ AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.values;
    }

    public C55135xeI(android.content.Context context, InterfaceC55228xfw interfaceC55228xfw) {
        this(context, interfaceC55228xfw, OLrzqt(), new C55143xeQ());
    }

    public C55135xeI(android.content.Context context, InterfaceC55228xfw interfaceC55228xfw, C59887zpg c59887zpg, InterfaceC55136xeJ interfaceC55136xeJ) {
        this.AhwBna = false;
        this.EZpvd = true;
        this.values = true;
        this.copydefault = new android.os.Handler(android.os.Looper.getMainLooper()) { // from class: o.xeI.1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message message) {
                int i = message.what;
            }
        };
        this.gEmmrt = 0;
        this.AYXKKw = interfaceC55228xfw;
        this.valueOf = c59887zpg;
        this.OLrzqt = interfaceC55136xeJ;
        this.djBIcL = new java.util.HashMap();
        this.gEmmrt = context.getResources().getDisplayMetrics().widthPixels;
        this.AEQbTJ = ContextCompat.getColor(context, C52761wXj.Activity.fdOvFl);
        this.KWHzl = ContextCompat.getColor(context, C52761wXj.Activity.DCUTEIddSDPG);
        AYXKKw();
    }

    public C55130xeD EZpvd(java.lang.String str) {
        return this.OLrzqt.AEQbTJ(str);
    }

    public void EZpvd(java.lang.String str, AbstractC55144xeR abstractC55144xeR) {
        this.djBIcL.put(str, abstractC55144xeR);
        abstractC55144xeR.KWHzl(this);
    }

    public android.text.Spannable AEQbTJ(java.lang.String str) {
        return EZpvd(this.valueOf.copydefault(str), (StateListAnimator) null);
    }

    public android.text.Spannable EZpvd(C59895zpo c59895zpo, StateListAnimator stateListAnimator) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        C55142xeP c55142xeP = new C55142xeP();
        copydefault(spannableStringBuilder, c59895zpo, c55142xeP, stateListAnimator);
        c55142xeP.KWHzl(this, spannableStringBuilder);
        return spannableStringBuilder;
    }

    public static C59887zpg OLrzqt() {
        C59887zpg c59887zpg = new C59887zpg();
        C59836zoZ c59836zoZOLrzqt = c59887zpg.OLrzqt();
        c59836zoZOLrzqt.KWHzl(true);
        c59836zoZOLrzqt.AEQbTJ(true);
        c59836zoZOLrzqt.OLrzqt(false);
        c59836zoZOLrzqt.valueOf(true);
        c59836zoZOLrzqt.djBIcL(true);
        c59836zoZOLrzqt.copydefault(true);
        c59836zoZOLrzqt.EZpvd(true);
        c59836zoZOLrzqt.gEmmrt(false);
        c59836zoZOLrzqt.copydefault("script,title");
        return c59887zpg;
    }

    public final void EZpvd(StateListAnimator stateListAnimator) {
        if (stateListAnimator != null && stateListAnimator.AEQbTJ()) {
            throw new ParsingCancelledException();
        }
    }

    public final void EZpvd(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.Object obj, C55142xeP c55142xeP, StateListAnimator stateListAnimator) {
        EZpvd(stateListAnimator);
        java.lang.String strOLrzqt = C55148xeV.OLrzqt(((C59881zpa) obj).KWHzl().toString(), false);
        if (KWHzl()) {
            strOLrzqt = strOLrzqt.replace((char) 160, ' ');
        }
        if (strOLrzqt.trim().length() > 0) {
            spannableStringBuilder.append((java.lang.CharSequence) strOLrzqt);
        }
    }

    public final void copydefault(android.text.SpannableStringBuilder spannableStringBuilder, C59895zpo c59895zpo, C55142xeP c55142xeP, StateListAnimator stateListAnimator) {
        EZpvd(stateListAnimator);
        AbstractC55144xeR c55216xfk = this.djBIcL.get(c59895zpo.values());
        if (c55216xfk == null) {
            c55216xfk = new C55216xfk();
            c55216xfk.KWHzl(this);
        }
        AbstractC55144xeR abstractC55144xeR = c55216xfk;
        int length = spannableStringBuilder.length();
        abstractC55144xeR.copydefault(c59895zpo, spannableStringBuilder, c55142xeP);
        if (!abstractC55144xeR.KWHzl()) {
            for (InterfaceC59833zoW interfaceC59833zoW : c59895zpo.AYXKKw()) {
                if (interfaceC59833zoW instanceof C59881zpa) {
                    EZpvd(spannableStringBuilder, interfaceC59833zoW, c55142xeP, stateListAnimator);
                } else if (interfaceC59833zoW instanceof C59895zpo) {
                    copydefault(spannableStringBuilder, (C59895zpo) interfaceC59833zoW, c55142xeP, stateListAnimator);
                }
            }
        }
        abstractC55144xeR.copydefault(c59895zpo, spannableStringBuilder, length, spannableStringBuilder.length(), c55142xeP);
    }

    private static C55216xfk AEQbTJ(C55216xfk c55216xfk) {
        return new C55217xfl(new C55219xfn(c55216xfk));
    }

    public final void AYXKKw() {
        C55216xfk c55216xfk = new C55216xfk(new Style().EZpvd(Style.FontStyle.ITALIC));
        EZpvd("i", c55216xfk);
        EZpvd("em", c55216xfk);
        EZpvd("cite", c55216xfk);
        EZpvd("dfn", c55216xfk);
        C55130xeD c55130xeDOLrzqt = AEQbTJ().OLrzqt();
        c55130xeDOLrzqt.AEQbTJ(ResourcesCompat.getFont(C32979mnm.EZpvd.OLrzqt(), C52761wXj.Dialog.EZpvd));
        C55216xfk c55216xfk2 = new C55216xfk(new Style().OLrzqt(c55130xeDOLrzqt));
        EZpvd("b", c55216xfk2);
        EZpvd("strong", c55216xfk2);
        Style styleCopydefault = new Style().copydefault(java.lang.Integer.valueOf(this.KWHzl));
        StyleValue.Unit unit = StyleValue.Unit.EM;
        C55216xfk c55216xfk3 = new C55216xfk(styleCopydefault.AhwBna(new StyleValue(1.0f, unit)).AEQbTJ(new StyleValue(2.0f, unit)));
        EZpvd("blockquote", c55216xfk3);
        EZpvd("ul", c55216xfk3);
        EZpvd("ol", c55216xfk3);
        C55216xfk c55216xfkAEQbTJ = AEQbTJ(new C55211xff());
        EZpvd(TtmlNode.TAG_TT, c55216xfkAEQbTJ);
        EZpvd("code", c55216xfkAEQbTJ);
        EZpvd(TtmlNode.TAG_STYLE, new C55213xfh());
        EZpvd(TtmlNode.TAG_BR, new C55207xfb(1, AEQbTJ(new C55216xfk())));
        EZpvd(TtmlNode.TAG_DIV, new C55218xfm(AEQbTJ(new C55216xfk(new Style().copydefault(java.lang.Integer.valueOf(this.KWHzl)).AEQbTJ(Style.DisplayStyle.BLOCK).OLrzqt(new StyleValue(1.0f, unit))))));
        EZpvd(TtmlNode.TAG_P, new C55209xfd(1.0f, 0.1f, this.KWHzl));
        EZpvd("h1", AEQbTJ(new C55206xfa(2.6f, 0.1f, this.AEQbTJ)));
        EZpvd("h2", AEQbTJ(new C55206xfa(2.3f, 0.1f, this.AEQbTJ)));
        EZpvd("h3", AEQbTJ(new C55206xfa(2.0f, 0.1f, this.AEQbTJ)));
        EZpvd("h4", AEQbTJ(new C55206xfa(1.7f, 0.1f, this.AEQbTJ)));
        EZpvd("h5", AEQbTJ(new C55206xfa(1.5f, 0.1f, this.AEQbTJ)));
        EZpvd("pre", new C55208xfc());
        EZpvd("big", new C55216xfk(new Style().copydefault(new StyleValue(1.25f, unit))));
        EZpvd("small", new C55216xfk(new Style().copydefault(new StyleValue(0.8f, unit))));
        EZpvd("sub", new C55214xfi());
        EZpvd("sup", new C55212xfg());
        EZpvd(TtmlNode.CENTER, new C55216xfk(new Style().EZpvd(Style.TextAlignment.CENTER)));
        EZpvd("li", new C55210xfe(this.KWHzl));
        EZpvd(IEncryptorType.DEFAULT_ENCRYPTOR, new C55152xeZ(this.AEQbTJ, this.AYXKKw));
        EZpvd("font", new C55151xeY());
    }
}
