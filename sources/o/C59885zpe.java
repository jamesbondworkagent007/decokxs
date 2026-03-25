package o;

import com.bytedance.applog.encryptor.IEncryptorType;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.htmlcleaner.BelongsTo;
import org.htmlcleaner.CloseTag;
import org.htmlcleaner.ContentType;

/* JADX INFO: renamed from: o.zpe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59885zpe implements InterfaceC59892zpl {
    public static final C59885zpe EZpvd = new C59885zpe();
    public ConcurrentMap<java.lang.String, C59894zpn> KWHzl = new ConcurrentHashMap();

    public C59885zpe() {
        copydefault(null);
        OLrzqt(null);
        EZpvd(null);
        KWHzl(null);
        AhwBna(null);
        AEQbTJ(null);
        AYXKKw(null);
        djBIcL(null);
        gEmmrt(null);
        valueOf(null);
    }

    public void copydefault(C59894zpn c59894zpn) {
        ContentType contentType = ContentType.text;
        BelongsTo belongsTo = BelongsTo.HEAD;
        CloseTag closeTag = CloseTag.required;
        org.htmlcleaner.Display display = org.htmlcleaner.Display.none;
        OLrzqt("title", new C59894zpn("title", contentType, belongsTo, false, true, false, closeTag, display));
        ContentType contentType2 = ContentType.all;
        BelongsTo belongsTo2 = BelongsTo.BODY;
        org.htmlcleaner.Display display2 = org.htmlcleaner.Display.block;
        C59894zpn c59894zpn2 = new C59894zpn("h1", contentType2, belongsTo2, false, false, false, closeTag, display2);
        c59894zpn2.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn2.KWHzl("p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt("h1", c59894zpn2);
        C59894zpn c59894zpn3 = new C59894zpn("h2", contentType2, belongsTo2, false, false, false, closeTag, display2);
        c59894zpn3.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn3.KWHzl("p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt("h2", c59894zpn3);
        C59894zpn c59894zpn4 = new C59894zpn("h3", contentType2, belongsTo2, false, false, false, closeTag, display2);
        c59894zpn4.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn4.KWHzl("p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt("h3", c59894zpn4);
        C59894zpn c59894zpn5 = new C59894zpn("h4", contentType2, belongsTo2, false, false, false, closeTag, display2);
        c59894zpn5.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn5.KWHzl("p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt("h4", c59894zpn5);
        C59894zpn c59894zpn6 = new C59894zpn("h5", contentType2, belongsTo2, false, false, false, closeTag, display2);
        c59894zpn6.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn6.KWHzl("p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt("h5", c59894zpn6);
        C59894zpn c59894zpn7 = new C59894zpn("h6", contentType2, belongsTo2, false, false, false, closeTag, display2);
        c59894zpn7.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn7.KWHzl("p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt("h6", c59894zpn7);
        C59894zpn c59894zpn8 = new C59894zpn(TtmlNode.TAG_P, contentType2, belongsTo2, false, false, false, closeTag, display2);
        c59894zpn8.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn8.KWHzl("p,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt(TtmlNode.TAG_P, c59894zpn8);
        ContentType contentType3 = ContentType.none;
        CloseTag closeTag2 = CloseTag.forbidden;
        OLrzqt(TtmlNode.TAG_BR, new C59894zpn(TtmlNode.TAG_BR, contentType3, belongsTo2, false, false, false, closeTag2, display));
        C59894zpn c59894zpn9 = new C59894zpn("hr", contentType3, belongsTo2, false, false, false, closeTag2, display2);
        c59894zpn9.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn9.KWHzl("p,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt("hr", c59894zpn9);
        C59894zpn c59894zpn10 = new C59894zpn(TtmlNode.TAG_DIV, contentType2, belongsTo2, false, false, false, closeTag, display2);
        c59894zpn10.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn10.KWHzl("p,details,summary,menuitem,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt(TtmlNode.TAG_DIV, c59894zpn10);
    }

    public void OLrzqt(C59894zpn c59894zpn) {
        ContentType contentType = ContentType.all;
        BelongsTo belongsTo = BelongsTo.BODY;
        CloseTag closeTag = CloseTag.required;
        org.htmlcleaner.Display display = org.htmlcleaner.Display.inline;
        OLrzqt("abbr", new C59894zpn("abbr", contentType, belongsTo, false, false, false, closeTag, display));
        OLrzqt("acronym", new C59894zpn("acronym", contentType, belongsTo, false, false, false, closeTag, display));
        org.htmlcleaner.Display display2 = org.htmlcleaner.Display.block;
        C59894zpn c59894zpn2 = new C59894zpn(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, contentType, belongsTo, false, false, false, closeTag, display2);
        c59894zpn2.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn2.KWHzl("p,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, c59894zpn2);
        C59894zpn c59894zpn3 = new C59894zpn("b", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn3.copydefault("u,i,tt,sub,sup,big,small,strike,blink,s");
        OLrzqt("b", c59894zpn3);
        OLrzqt("bdo", new C59894zpn("bdo", contentType, belongsTo, false, false, false, closeTag, display));
        C59894zpn c59894zpn4 = new C59894zpn("blockquote", contentType, belongsTo, false, false, false, closeTag, display2);
        c59894zpn4.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn4.KWHzl("p,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt("blockquote", c59894zpn4);
        OLrzqt("cite", new C59894zpn("cite", contentType, belongsTo, false, false, false, closeTag, display));
        OLrzqt("q", new C59894zpn("q", contentType, belongsTo, false, false, false, closeTag, display));
        OLrzqt("code", new C59894zpn("code", contentType, belongsTo, false, false, false, closeTag, display));
        org.htmlcleaner.Display display3 = org.htmlcleaner.Display.any;
        OLrzqt("ins", new C59894zpn("ins", contentType, belongsTo, false, false, false, closeTag, display3));
        C59894zpn c59894zpn5 = new C59894zpn("i", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn5.copydefault("b,u,tt,sub,sup,big,small,strike,blink,s");
        OLrzqt("i", c59894zpn5);
        C59894zpn c59894zpn6 = new C59894zpn("u", contentType, belongsTo, true, false, false, closeTag, display);
        c59894zpn6.copydefault("b,i,tt,sub,sup,big,small,strike,blink,s");
        OLrzqt("u", c59894zpn6);
        C59894zpn c59894zpn7 = new C59894zpn(TtmlNode.TAG_TT, contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn7.copydefault("b,u,i,sub,sup,big,small,strike,blink,s");
        OLrzqt(TtmlNode.TAG_TT, c59894zpn7);
        C59894zpn c59894zpn8 = new C59894zpn("sub", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn8.copydefault("b,u,i,tt,sup,big,small,strike,blink,s");
        OLrzqt("sub", c59894zpn8);
        C59894zpn c59894zpn9 = new C59894zpn("sup", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn9.copydefault("b,u,i,tt,sub,big,small,strike,blink,s");
        OLrzqt("sup", c59894zpn9);
        C59894zpn c59894zpn10 = new C59894zpn("big", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn10.copydefault("b,u,i,tt,sub,sup,small,strike,blink,s");
        OLrzqt("big", c59894zpn10);
        C59894zpn c59894zpn11 = new C59894zpn("small", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn11.copydefault("b,u,i,tt,sub,sup,big,strike,blink,s");
        OLrzqt("small", c59894zpn11);
        C59894zpn c59894zpn12 = new C59894zpn("strike", contentType, belongsTo, true, false, false, closeTag, display);
        c59894zpn12.copydefault("b,u,i,tt,sub,sup,big,small,blink,s");
        OLrzqt("strike", c59894zpn12);
        C59894zpn c59894zpn13 = new C59894zpn("blink", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn13.copydefault("b,u,i,tt,sub,sup,big,small,strike,s");
        OLrzqt("blink", c59894zpn13);
        C59894zpn c59894zpn14 = new C59894zpn("marquee", contentType, belongsTo, false, false, false, closeTag, display2);
        c59894zpn14.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn14.KWHzl("p,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt("marquee", c59894zpn14);
        C59894zpn c59894zpn15 = new C59894zpn(com.ibm.icu.text.DateFormat.SECOND, contentType, belongsTo, true, false, false, closeTag, display);
        c59894zpn15.copydefault("b,u,i,tt,sub,sup,big,small,strike,blink");
        OLrzqt(com.ibm.icu.text.DateFormat.SECOND, c59894zpn15);
        OLrzqt("font", new C59894zpn("font", contentType, belongsTo, true, false, false, closeTag, display));
        ContentType contentType2 = ContentType.none;
        CloseTag closeTag2 = CloseTag.forbidden;
        org.htmlcleaner.Display display4 = org.htmlcleaner.Display.none;
        OLrzqt("basefont", new C59894zpn("basefont", contentType2, belongsTo, true, false, false, closeTag2, display4));
        C59894zpn c59894zpn16 = new C59894zpn(TtmlNode.CENTER, contentType, belongsTo, true, false, false, closeTag, display2);
        c59894zpn16.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn16.KWHzl("p,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt(TtmlNode.CENTER, c59894zpn16);
        OLrzqt("del", new C59894zpn("del", contentType, belongsTo, false, false, false, closeTag, display3));
        OLrzqt("dfn", new C59894zpn("dfn", contentType, belongsTo, false, false, false, closeTag, display));
        OLrzqt("kbd", new C59894zpn("kbd", contentType, belongsTo, false, false, false, closeTag, display));
        C59894zpn c59894zpn17 = new C59894zpn("pre", contentType, belongsTo, false, false, false, closeTag, display2);
        c59894zpn17.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn17.KWHzl("p,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt("pre", c59894zpn17);
        OLrzqt("samp", new C59894zpn("samp", contentType, belongsTo, false, false, false, closeTag, display));
        OLrzqt("strong", new C59894zpn("strong", contentType, belongsTo, false, false, false, closeTag, display));
        OLrzqt("em", new C59894zpn("em", contentType, belongsTo, false, false, false, closeTag, display));
        OLrzqt("var", new C59894zpn("var", contentType, belongsTo, false, false, false, closeTag, display));
        OLrzqt("wbr", new C59894zpn("wbr", contentType2, belongsTo, false, false, false, closeTag2, display4));
    }

    public void EZpvd(C59894zpn c59894zpn) {
        ContentType contentType = ContentType.all;
        BelongsTo belongsTo = BelongsTo.BODY;
        CloseTag closeTag = CloseTag.required;
        org.htmlcleaner.Display display = org.htmlcleaner.Display.block;
        C59894zpn c59894zpn2 = new C59894zpn("form", contentType, belongsTo, false, false, true, closeTag, display);
        c59894zpn2.AYXKKw("form");
        c59894zpn2.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn2.KWHzl("option,optgroup,textarea,select,fieldset,p,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt("form", c59894zpn2);
        ContentType contentType2 = ContentType.none;
        CloseTag closeTag2 = CloseTag.forbidden;
        org.htmlcleaner.Display display2 = org.htmlcleaner.Display.inline;
        C59894zpn c59894zpn3 = new C59894zpn(Web3SecurityTrackEvent.VALUE_INPUT, contentType2, belongsTo, false, false, false, closeTag2, display2);
        c59894zpn3.KWHzl("select,optgroup,option");
        OLrzqt(Web3SecurityTrackEvent.VALUE_INPUT, c59894zpn3);
        C59894zpn c59894zpn4 = new C59894zpn("textarea", contentType, belongsTo, false, false, false, closeTag, display2);
        c59894zpn4.KWHzl("select,optgroup,option");
        OLrzqt("textarea", c59894zpn4);
        C59894zpn c59894zpn5 = new C59894zpn("select", contentType, belongsTo, false, false, true, closeTag, display2);
        c59894zpn5.EZpvd("option,optgroup");
        c59894zpn5.KWHzl("option,optgroup,select");
        OLrzqt("select", c59894zpn5);
        C59894zpn c59894zpn6 = new C59894zpn("option", ContentType.text, belongsTo, false, false, true, CloseTag.optional, display2);
        c59894zpn6.OLrzqt("select");
        c59894zpn6.KWHzl("option");
        OLrzqt("option", c59894zpn6);
        C59894zpn c59894zpn7 = new C59894zpn("optgroup", contentType, belongsTo, false, false, true, closeTag, display2);
        c59894zpn7.OLrzqt("select");
        c59894zpn7.EZpvd("option");
        c59894zpn7.KWHzl("optgroup");
        OLrzqt("optgroup", c59894zpn7);
        C59894zpn c59894zpn8 = new C59894zpn("button", contentType, belongsTo, false, false, false, closeTag, org.htmlcleaner.Display.any);
        c59894zpn8.KWHzl("select,optgroup,option");
        OLrzqt("button", c59894zpn8);
        OLrzqt("label", new C59894zpn("label", contentType, belongsTo, false, false, false, closeTag, display2));
        C59894zpn c59894zpn9 = new C59894zpn("legend", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn9.EZpvd("a,abbr,area,b,bdi,bdo,br,button,canvas,cite,code,command,data,datalist,del,dfn,em,embed,i,iframe,img,input,ins,kbd,keygen,label,link,map,mark,math,meta,meter,noscript,object,output,progress,q,s,samp,script,select,small,span,strong,sub,sup,svg,template,text,textarea,time,u,var,wbr");
        OLrzqt("legend", c59894zpn9);
        C59894zpn c59894zpn10 = new C59894zpn("fieldset", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn10.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn10.KWHzl("p,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt("fieldset", c59894zpn10);
    }

    public void AhwBna(C59894zpn c59894zpn) {
        ContentType contentType = ContentType.all;
        BelongsTo belongsTo = BelongsTo.BODY;
        CloseTag closeTag = CloseTag.required;
        org.htmlcleaner.Display display = org.htmlcleaner.Display.block;
        C59894zpn c59894zpn2 = new C59894zpn("ul", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn2.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn2.KWHzl("p,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt("ul", c59894zpn2);
        C59894zpn c59894zpn3 = new C59894zpn("ol", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn3.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn3.KWHzl("p,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt("ol", c59894zpn3);
        CloseTag closeTag2 = CloseTag.optional;
        C59894zpn c59894zpn4 = new C59894zpn("li", contentType, belongsTo, false, false, false, closeTag2, display);
        c59894zpn4.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn4.KWHzl("li,p,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt("li", c59894zpn4);
        C59894zpn c59894zpn5 = new C59894zpn("dl", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn5.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn5.KWHzl("p,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt("dl", c59894zpn5);
        C59894zpn c59894zpn6 = new C59894zpn("dt", contentType, belongsTo, false, false, false, closeTag2, display);
        c59894zpn6.KWHzl("dt,dd");
        OLrzqt("dt", c59894zpn6);
        C59894zpn c59894zpn7 = new C59894zpn("dd", contentType, belongsTo, false, false, false, closeTag2, display);
        c59894zpn7.KWHzl("dt,dd");
        OLrzqt("dd", c59894zpn7);
        C59894zpn c59894zpn8 = new C59894zpn("menu", contentType, belongsTo, true, false, false, closeTag, display);
        c59894zpn8.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn8.KWHzl("p,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt("menu", c59894zpn8);
        C59894zpn c59894zpn9 = new C59894zpn("dir", contentType, belongsTo, true, false, false, closeTag, display);
        c59894zpn9.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn9.KWHzl("p,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt("dir", c59894zpn9);
    }

    public void AEQbTJ(C59894zpn c59894zpn) {
        OLrzqt("link", new C59894zpn("link", ContentType.none, BelongsTo.HEAD, false, false, false, CloseTag.forbidden, org.htmlcleaner.Display.none));
        C59894zpn c59894zpn2 = new C59894zpn(IEncryptorType.DEFAULT_ENCRYPTOR, ContentType.all, BelongsTo.BODY, false, false, false, CloseTag.required, org.htmlcleaner.Display.inline);
        c59894zpn2.KWHzl(IEncryptorType.DEFAULT_ENCRYPTOR);
        OLrzqt(IEncryptorType.DEFAULT_ENCRYPTOR, c59894zpn2);
    }

    public void AYXKKw(C59894zpn c59894zpn) {
        ContentType contentType = ContentType.all;
        BelongsTo belongsTo = BelongsTo.BODY;
        CloseTag closeTag = CloseTag.required;
        org.htmlcleaner.Display display = org.htmlcleaner.Display.block;
        C59894zpn c59894zpn2 = new C59894zpn("table", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn2.EZpvd("tr,tbody,thead,tfoot,colgroup,caption");
        c59894zpn2.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn2.KWHzl("tr,thead,tbody,tfoot,caption,colgroup,table,p,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt("table", c59894zpn2);
        CloseTag closeTag2 = CloseTag.optional;
        C59894zpn c59894zpn3 = new C59894zpn("tr", contentType, belongsTo, false, false, false, closeTag2, display);
        c59894zpn3.OLrzqt("table");
        c59894zpn3.AhwBna("tbody");
        c59894zpn3.EZpvd("td,th");
        c59894zpn3.valueOf("thead,tfoot");
        c59894zpn3.KWHzl("tr,td,th,caption,colgroup");
        OLrzqt("tr", c59894zpn3);
        C59894zpn c59894zpn4 = new C59894zpn("td", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn4.OLrzqt("table");
        c59894zpn4.AhwBna("tr");
        c59894zpn4.KWHzl("td,th,caption,colgroup");
        OLrzqt("td", c59894zpn4);
        C59894zpn c59894zpn5 = new C59894zpn("th", contentType, belongsTo, false, false, false, closeTag2, display);
        c59894zpn5.OLrzqt("table");
        c59894zpn5.AhwBna("tr");
        c59894zpn5.KWHzl("td,th,caption,colgroup");
        OLrzqt("th", c59894zpn5);
        C59894zpn c59894zpn6 = new C59894zpn("tbody", contentType, belongsTo, false, false, false, closeTag2, display);
        c59894zpn6.OLrzqt("table");
        c59894zpn6.EZpvd("tr,form");
        c59894zpn6.KWHzl("td,th,tr,tbody,thead,tfoot,caption,colgroup");
        OLrzqt("tbody", c59894zpn6);
        C59894zpn c59894zpn7 = new C59894zpn("thead", contentType, belongsTo, false, false, false, closeTag2, display);
        c59894zpn7.OLrzqt("table");
        c59894zpn7.EZpvd("tr,form");
        c59894zpn7.KWHzl("td,th,tr,tbody,thead,tfoot,caption,colgroup");
        OLrzqt("thead", c59894zpn7);
        C59894zpn c59894zpn8 = new C59894zpn("tfoot", contentType, belongsTo, false, false, false, closeTag2, display);
        c59894zpn8.OLrzqt("table");
        c59894zpn8.EZpvd("tr,form");
        c59894zpn8.KWHzl("td,th,tr,tbody,thead,tfoot,caption,colgroup");
        OLrzqt("tfoot", c59894zpn8);
        C59894zpn c59894zpn9 = new C59894zpn("col", ContentType.none, belongsTo, false, false, false, CloseTag.forbidden, display);
        c59894zpn9.OLrzqt("colgroup");
        OLrzqt("col", c59894zpn9);
        C59894zpn c59894zpn10 = new C59894zpn("colgroup", contentType, belongsTo, false, false, false, closeTag2, display);
        c59894zpn10.OLrzqt("table");
        c59894zpn10.EZpvd("col");
        c59894zpn10.KWHzl("td,th,tr,tbody,thead,tfoot,caption,colgroup");
        OLrzqt("colgroup", c59894zpn10);
        C59894zpn c59894zpn11 = new C59894zpn("caption", contentType, belongsTo, false, false, false, closeTag, org.htmlcleaner.Display.inline);
        c59894zpn11.OLrzqt("table");
        c59894zpn11.KWHzl("td,th,tr,tbody,thead,tfoot,caption,colgroup");
        OLrzqt("caption", c59894zpn11);
    }

    public void djBIcL(C59894zpn c59894zpn) {
        ContentType contentType = ContentType.all;
        BelongsTo belongsTo = BelongsTo.BODY;
        CloseTag closeTag = CloseTag.required;
        OLrzqt(TtmlNode.TAG_SPAN, new C59894zpn(TtmlNode.TAG_SPAN, contentType, belongsTo, false, false, false, closeTag, org.htmlcleaner.Display.inline));
        ContentType contentType2 = ContentType.text;
        BelongsTo belongsTo2 = BelongsTo.HEAD;
        org.htmlcleaner.Display display = org.htmlcleaner.Display.none;
        OLrzqt(TtmlNode.TAG_STYLE, new C59894zpn(TtmlNode.TAG_STYLE, contentType2, belongsTo2, false, false, false, closeTag, display));
        ContentType contentType3 = ContentType.none;
        CloseTag closeTag2 = CloseTag.forbidden;
        OLrzqt("bgsound", new C59894zpn("bgsound", contentType3, belongsTo2, false, false, false, closeTag2, display));
        OLrzqt("meta", new C59894zpn("meta", contentType3, belongsTo2, false, false, false, closeTag2, display));
        OLrzqt(TtmlNode.RUBY_BASE, new C59894zpn(TtmlNode.RUBY_BASE, contentType3, belongsTo2, false, false, false, closeTag2, display));
    }

    public void valueOf(C59894zpn c59894zpn) {
        ContentType contentType = ContentType.all;
        BelongsTo belongsTo = BelongsTo.HEAD_AND_BODY;
        CloseTag closeTag = CloseTag.required;
        org.htmlcleaner.Display display = org.htmlcleaner.Display.none;
        OLrzqt("script", new C59894zpn("script", contentType, belongsTo, false, false, false, closeTag, display));
        OLrzqt("noscript", new C59894zpn("noscript", contentType, belongsTo, false, false, false, closeTag, org.htmlcleaner.Display.block));
        BelongsTo belongsTo2 = BelongsTo.BODY;
        org.htmlcleaner.Display display2 = org.htmlcleaner.Display.any;
        OLrzqt("applet", new C59894zpn("applet", contentType, belongsTo2, true, false, false, closeTag, display2));
        OLrzqt("object", new C59894zpn("object", contentType, belongsTo2, false, false, false, closeTag, display2));
        C59894zpn c59894zpn2 = new C59894zpn("param", ContentType.none, belongsTo2, false, false, false, CloseTag.forbidden, display);
        c59894zpn2.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn2.KWHzl("p,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt("param", c59894zpn2);
    }

    public void KWHzl(C59894zpn c59894zpn) {
        ContentType contentType = ContentType.none;
        BelongsTo belongsTo = BelongsTo.BODY;
        CloseTag closeTag = CloseTag.forbidden;
        OLrzqt("img", new C59894zpn("img", contentType, belongsTo, false, false, false, closeTag, org.htmlcleaner.Display.inline));
        C59894zpn c59894zpn2 = new C59894zpn(OtcExtraKeys.AREA, contentType, belongsTo, false, false, false, closeTag, org.htmlcleaner.Display.none);
        c59894zpn2.OLrzqt("map");
        c59894zpn2.KWHzl(OtcExtraKeys.AREA);
        OLrzqt(OtcExtraKeys.AREA, c59894zpn2);
        C59894zpn c59894zpn3 = new C59894zpn("map", ContentType.all, belongsTo, false, false, false, CloseTag.required, org.htmlcleaner.Display.any);
        c59894zpn3.KWHzl("map");
        OLrzqt("map", c59894zpn3);
    }

    public void gEmmrt(C59894zpn c59894zpn) {
        ContentType contentType = ContentType.all;
        BelongsTo belongsTo = BelongsTo.BODY;
        CloseTag closeTag = CloseTag.required;
        org.htmlcleaner.Display display = org.htmlcleaner.Display.block;
        C59894zpn c59894zpn2 = new C59894zpn("listing", contentType, belongsTo, false, false, false, closeTag, display);
        c59894zpn2.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn2.KWHzl("p,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt("listing", c59894zpn2);
        org.htmlcleaner.Display display2 = org.htmlcleaner.Display.inline;
        C59894zpn c59894zpn3 = new C59894zpn("nobr", contentType, belongsTo, false, false, false, closeTag, display2);
        c59894zpn3.KWHzl("nobr");
        OLrzqt("nobr", c59894zpn3);
        OLrzqt("xmp", new C59894zpn("xmp", ContentType.text, belongsTo, false, false, false, closeTag, display2));
        org.htmlcleaner.Display display3 = org.htmlcleaner.Display.none;
        OLrzqt("xml", new C59894zpn("xml", contentType, belongsTo, false, false, false, closeTag, display3));
        C59894zpn c59894zpn4 = new C59894zpn("isindex", ContentType.none, belongsTo, true, false, false, CloseTag.forbidden, display);
        c59894zpn4.AEQbTJ("bdo,strong,em,q,b,i,u,tt,sub,sup,big,small,strike,s,font");
        c59894zpn4.KWHzl("p,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        OLrzqt("isindex", c59894zpn4);
        OLrzqt("comment", new C59894zpn("comment", contentType, belongsTo, false, false, false, closeTag, display3));
        OLrzqt("server", new C59894zpn("server", contentType, belongsTo, false, false, false, closeTag, display3));
        OLrzqt("iframe", new C59894zpn("iframe", contentType, belongsTo, false, false, false, closeTag, org.htmlcleaner.Display.any));
    }

    public void OLrzqt(java.lang.String str, C59894zpn c59894zpn) {
        this.KWHzl.put(str, c59894zpn);
    }

    @Override // o.InterfaceC59892zpl
    public C59894zpn getTagInfo(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return this.KWHzl.get(str);
    }
}
