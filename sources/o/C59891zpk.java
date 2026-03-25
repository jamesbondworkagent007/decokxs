package o;

import java.util.concurrent.ConcurrentMap;
import org.htmlcleaner.BelongsTo;
import org.htmlcleaner.CloseTag;
import org.htmlcleaner.ContentType;

/* JADX INFO: renamed from: o.zpk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59891zpk {
    public C59891zpk(C59894zpn c59894zpn, ConcurrentMap<java.lang.String, C59894zpn> concurrentMap) {
        OLrzqt(c59894zpn, concurrentMap);
    }

    public void OLrzqt(C59894zpn c59894zpn, ConcurrentMap<java.lang.String, C59894zpn> concurrentMap) {
        AEQbTJ(c59894zpn, concurrentMap);
        EZpvd(c59894zpn, concurrentMap);
        KWHzl(c59894zpn, concurrentMap);
        copydefault(c59894zpn, concurrentMap);
        C59894zpn c59894zpn2 = new C59894zpn("maction", ContentType.all, BelongsTo.BODY, false, false, false, CloseTag.required, org.htmlcleaner.Display.block);
        c59894zpn2.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("maction", c59894zpn2, concurrentMap);
    }

    public void AEQbTJ(C59894zpn c59894zpn, ConcurrentMap<java.lang.String, C59894zpn> concurrentMap) {
        ContentType contentType = ContentType.all;
        BelongsTo belongsTo = BelongsTo.BODY;
        CloseTag closeTag = CloseTag.required;
        org.htmlcleaner.Display display = org.htmlcleaner.Display.inline;
        C59894zpn c59894zpn2 = new C59894zpn("mi", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn2.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("mi", c59894zpn2, concurrentMap);
        C59894zpn c59894zpn3 = new C59894zpn("mn", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn3.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("mn", c59894zpn3, concurrentMap);
        C59894zpn c59894zpn4 = new C59894zpn("mo", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn4.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("mo", c59894zpn4, concurrentMap);
        org.htmlcleaner.Display display2 = org.htmlcleaner.Display.block;
        C59894zpn c59894zpn5 = new C59894zpn("mtext", contentType, belongsTo, false, false, false, closeTag, display2);
        c59894zpn5.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("mtext", c59894zpn5, concurrentMap);
        CloseTag closeTag2 = CloseTag.optional;
        C59894zpn c59894zpn6 = new C59894zpn("mspace", contentType, belongsTo, false, false, false, closeTag2, display2);
        c59894zpn6.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("mspace", c59894zpn6, concurrentMap);
        C59894zpn c59894zpn7 = new C59894zpn(com.ibm.icu.text.DateFormat.MINUTE_SECOND, contentType, belongsTo, false, false, false, closeTag, display2);
        c59894zpn7.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd(com.ibm.icu.text.DateFormat.MINUTE_SECOND, c59894zpn7, concurrentMap);
        C59894zpn c59894zpn8 = new C59894zpn("mglyph", contentType, belongsTo, false, false, false, closeTag2, display2);
        c59894zpn8.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("mglyph", c59894zpn8, concurrentMap);
    }

    public void EZpvd(C59894zpn c59894zpn, ConcurrentMap<java.lang.String, C59894zpn> concurrentMap) {
        ContentType contentType = ContentType.all;
        BelongsTo belongsTo = BelongsTo.BODY;
        CloseTag closeTag = CloseTag.required;
        org.htmlcleaner.Display display = org.htmlcleaner.Display.block;
        C59894zpn c59894zpn2 = new C59894zpn("mrow", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn2.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("mrow", c59894zpn2, concurrentMap);
        C59894zpn c59894zpn3 = new C59894zpn("mfrac", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn3.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("mfrac", c59894zpn3, concurrentMap);
        org.htmlcleaner.Display display2 = org.htmlcleaner.Display.inline;
        C59894zpn c59894zpn4 = new C59894zpn("msqrt", contentType, belongsTo, false, false, false, closeTag, display2);
        c59894zpn4.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("msqrt", c59894zpn4, concurrentMap);
        C59894zpn c59894zpn5 = new C59894zpn("mroot", contentType, belongsTo, false, false, false, closeTag, display2);
        c59894zpn5.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("mroot", c59894zpn5, concurrentMap);
        C59894zpn c59894zpn6 = new C59894zpn("mstyle", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn6.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("mstyle", c59894zpn6, concurrentMap);
        C59894zpn c59894zpn7 = new C59894zpn("merror", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn7.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("merror", c59894zpn7, concurrentMap);
        C59894zpn c59894zpn8 = new C59894zpn("mpadded", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn8.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("mpadded", c59894zpn8, concurrentMap);
        C59894zpn c59894zpn9 = new C59894zpn("mphantom", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn9.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("mphantom", c59894zpn9, concurrentMap);
        C59894zpn c59894zpn10 = new C59894zpn("mfenced", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn10.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("mfenced", c59894zpn10, concurrentMap);
        C59894zpn c59894zpn11 = new C59894zpn("menclose", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn11.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("menclose", c59894zpn11, concurrentMap);
    }

    public void KWHzl(C59894zpn c59894zpn, ConcurrentMap<java.lang.String, C59894zpn> concurrentMap) {
        ContentType contentType = ContentType.all;
        BelongsTo belongsTo = BelongsTo.BODY;
        CloseTag closeTag = CloseTag.required;
        org.htmlcleaner.Display display = org.htmlcleaner.Display.inline;
        C59894zpn c59894zpn2 = new C59894zpn("msub", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn2.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("msub", c59894zpn2, concurrentMap);
        C59894zpn c59894zpn3 = new C59894zpn("msup", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn3.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("msup", c59894zpn3, concurrentMap);
        org.htmlcleaner.Display display2 = org.htmlcleaner.Display.block;
        C59894zpn c59894zpn4 = new C59894zpn("msubsup", contentType, belongsTo, false, false, false, closeTag, display2);
        c59894zpn4.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("msubsup", c59894zpn4, concurrentMap);
        C59894zpn c59894zpn5 = new C59894zpn("munder", contentType, belongsTo, false, false, false, closeTag, display2);
        c59894zpn5.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("munder", c59894zpn5, concurrentMap);
        C59894zpn c59894zpn6 = new C59894zpn("mover", contentType, belongsTo, false, false, false, closeTag, display2);
        c59894zpn6.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("mover", c59894zpn6, concurrentMap);
        C59894zpn c59894zpn7 = new C59894zpn("munderover", contentType, belongsTo, false, false, false, closeTag, display2);
        c59894zpn7.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("munderover", c59894zpn7, concurrentMap);
        C59894zpn c59894zpn8 = new C59894zpn("mmultiscripts", contentType, belongsTo, false, false, false, closeTag, display2);
        c59894zpn8.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("mmultiscripts", c59894zpn8, concurrentMap);
    }

    public void copydefault(C59894zpn c59894zpn, ConcurrentMap<java.lang.String, C59894zpn> concurrentMap) {
        ContentType contentType = ContentType.all;
        BelongsTo belongsTo = BelongsTo.BODY;
        CloseTag closeTag = CloseTag.required;
        org.htmlcleaner.Display display = org.htmlcleaner.Display.block;
        C59894zpn c59894zpn2 = new C59894zpn("mtable", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn2.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        c59894zpn2.EZpvd("mtr,mtd,mo,mn,mlabeledtr");
        EZpvd("mtable", c59894zpn2, concurrentMap);
        C59894zpn c59894zpn3 = new C59894zpn("mlabeledtr", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn3.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        c59894zpn3.AhwBna("mtable");
        c59894zpn3.OLrzqt("mtable");
        EZpvd("mlabeledtr", c59894zpn3, concurrentMap);
        C59894zpn c59894zpn4 = new C59894zpn("mtr", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn4.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        c59894zpn4.EZpvd("mtd,mlabeledtr");
        c59894zpn4.AhwBna("mtable");
        EZpvd("mtr", c59894zpn4, concurrentMap);
        C59894zpn c59894zpn5 = new C59894zpn("mtd", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn5.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        c59894zpn5.AhwBna("mtr");
        c59894zpn5.OLrzqt("mtable");
        EZpvd("mtd", c59894zpn5, concurrentMap);
        C59894zpn c59894zpn6 = new C59894zpn("maligngroup", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn6.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("maligngroup", c59894zpn6, concurrentMap);
        C59894zpn c59894zpn7 = new C59894zpn("malignmark", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn7.KWHzl("menclose,mpadded,mphantom,mfenced,mstyle,merror,msqrt,mroot,mtd,mtr,maligngroup,malignmark,mlabeledtr,ms,mi,mo,mn,mfrac,mrow,mtext,mspace,mglyph,p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        EZpvd("malignmark", c59894zpn7, concurrentMap);
    }

    public void EZpvd(java.lang.String str, C59894zpn c59894zpn, ConcurrentMap<java.lang.String, C59894zpn> concurrentMap) {
        concurrentMap.put(str, c59894zpn);
    }
}
