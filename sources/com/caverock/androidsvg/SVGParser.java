package com.caverock.androidsvg;

import android.graphics.Matrix;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Xml;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import kotlinx.coroutines.DebugKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.SK;
import o.SP;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class SVGParser {
    public int AEQbTJ;
    public SVG djBIcL = null;
    public SVG.PackageManager OLrzqt = null;
    public boolean KWHzl = false;
    public boolean EZpvd = false;
    public SVGElem gEmmrt = null;
    public StringBuilder AhwBna = null;
    public boolean copydefault = false;
    public StringBuilder AYXKKw = null;

    public static float EZpvd(float f, float f2, float f3) {
        float f4;
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        if (f3 < 1.0f) {
            f4 = (f2 - f) * f3;
        } else {
            if (f3 < 3.0f) {
                return f2;
            }
            if (f3 >= 4.0f) {
                return f;
            }
            f4 = (f2 - f) * (4.0f - f3);
        }
        return f4 + f;
    }

    public final void AEQbTJ() {
    }

    public final void OLrzqt(String str, Object... objArr) {
    }

    public enum SVGElem {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;

        private static final Map<String, SVGElem> cache = new HashMap();

        static {
            for (SVGElem sVGElem : values()) {
                if (sVGElem == SWITCH) {
                    cache.put("switch", sVGElem);
                } else if (sVGElem != UNSUPPORTED) {
                    cache.put(sVGElem.name(), sVGElem);
                }
            }
        }

        public static SVGElem fromString(String str) {
            SVGElem sVGElem = cache.get(str);
            return sVGElem != null ? sVGElem : UNSUPPORTED;
        }
    }

    public enum SVGAttr {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;

        private static final Map<String, SVGAttr> cache = new HashMap();

        static {
            for (SVGAttr sVGAttr : values()) {
                if (sVGAttr == CLASS) {
                    cache.put("class", sVGAttr);
                } else {
                    if (sVGAttr != UNSUPPORTED) {
                        cache.put(sVGAttr.name().replace('_', '-'), sVGAttr);
                    }
                }
            }
        }

        public static SVGAttr fromString(String str) {
            SVGAttr sVGAttr = cache.get(str);
            return sVGAttr != null ? sVGAttr : UNSUPPORTED;
        }
    }

    public static class TaskDescription {
        public static final Map<String, Integer> EZpvd;

        private TaskDescription() {
        }

        static {
            HashMap map = new HashMap(47);
            EZpvd = map;
            map.put("aliceblue", -984833);
            map.put("antiquewhite", -332841);
            map.put("aqua", -16711681);
            map.put("aquamarine", -8388652);
            map.put("azure", -983041);
            map.put("beige", -657956);
            map.put("bisque", -6972);
            map.put("black", Integer.valueOf(ViewCompat.MEASURED_STATE_MASK));
            map.put("blanchedalmond", -5171);
            map.put("blue", -16776961);
            map.put("blueviolet", -7722014);
            map.put("brown", -5952982);
            map.put("burlywood", -2180985);
            map.put("cadetblue", -10510688);
            map.put("chartreuse", -8388864);
            map.put("chocolate", -2987746);
            map.put("coral", -32944);
            map.put("cornflowerblue", -10185235);
            map.put("cornsilk", -1828);
            map.put("crimson", -2354116);
            map.put("cyan", -16711681);
            map.put("darkblue", -16777077);
            map.put("darkcyan", -16741493);
            map.put("darkgoldenrod", -4684277);
            map.put("darkgray", -5658199);
            map.put("darkgreen", -16751616);
            map.put("darkgrey", -5658199);
            map.put("darkkhaki", -4343957);
            map.put("darkmagenta", -7667573);
            map.put("darkolivegreen", -11179217);
            map.put("darkorange", -29696);
            map.put("darkorchid", -6737204);
            map.put("darkred", -7667712);
            map.put("darksalmon", -1468806);
            map.put("darkseagreen", -7357297);
            map.put("darkslateblue", -12042869);
            map.put("darkslategray", -13676721);
            map.put("darkslategrey", -13676721);
            map.put("darkturquoise", -16724271);
            map.put("darkviolet", -7077677);
            map.put("deeppink", -60269);
            map.put("deepskyblue", -16728065);
            map.put("dimgray", -9868951);
            map.put("dimgrey", -9868951);
            map.put("dodgerblue", -14774017);
            map.put("firebrick", -5103070);
            map.put("floralwhite", -1296);
            map.put("forestgreen", -14513374);
            map.put("fuchsia", -65281);
            map.put("gainsboro", -2302756);
            map.put("ghostwhite", -460545);
            map.put("gold", -10496);
            map.put("goldenrod", -2448096);
            map.put("gray", -8355712);
            map.put("green", -16744448);
            map.put("greenyellow", -5374161);
            map.put("grey", -8355712);
            map.put("honeydew", -983056);
            map.put("hotpink", -38476);
            map.put("indianred", -3318692);
            map.put("indigo", -11861886);
            map.put("ivory", -16);
            map.put("khaki", -989556);
            map.put("lavender", -1644806);
            map.put("lavenderblush", -3851);
            map.put("lawngreen", -8586240);
            map.put("lemonchiffon", -1331);
            map.put("lightblue", -5383962);
            map.put("lightcoral", -1015680);
            map.put("lightcyan", -2031617);
            map.put("lightgoldenrodyellow", -329006);
            map.put("lightgray", -2894893);
            map.put("lightgreen", -7278960);
            map.put("lightgrey", -2894893);
            map.put("lightpink", -18751);
            map.put("lightsalmon", -24454);
            map.put("lightseagreen", -14634326);
            map.put("lightskyblue", -7876870);
            map.put("lightslategray", -8943463);
            map.put("lightslategrey", -8943463);
            map.put("lightsteelblue", -5192482);
            map.put("lightyellow", -32);
            map.put("lime", -16711936);
            map.put("limegreen", -13447886);
            map.put("linen", -331546);
            map.put("magenta", -65281);
            map.put("maroon", -8388608);
            map.put("mediumaquamarine", -10039894);
            map.put("mediumblue", -16777011);
            map.put("mediumorchid", -4565549);
            map.put("mediumpurple", -7114533);
            map.put("mediumseagreen", -12799119);
            map.put("mediumslateblue", -8689426);
            map.put("mediumspringgreen", -16713062);
            map.put("mediumturquoise", -12004916);
            map.put("mediumvioletred", -3730043);
            map.put("midnightblue", -15132304);
            map.put("mintcream", -655366);
            map.put("mistyrose", -6943);
            map.put("moccasin", -6987);
            map.put("navajowhite", -8531);
            map.put("navy", -16777088);
            map.put("oldlace", -133658);
            map.put("olive", -8355840);
            map.put("olivedrab", -9728477);
            map.put("orange", -23296);
            map.put("orangered", -47872);
            map.put("orchid", -2461482);
            map.put("palegoldenrod", -1120086);
            map.put("palegreen", -6751336);
            map.put("paleturquoise", -5247250);
            map.put("palevioletred", -2396013);
            map.put("papayawhip", -4139);
            map.put("peachpuff", -9543);
            map.put("peru", -3308225);
            map.put("pink", -16181);
            map.put("plum", -2252579);
            map.put("powderblue", -5185306);
            map.put("purple", -8388480);
            map.put("rebeccapurple", -10079335);
            map.put("red", Integer.valueOf(SupportMenu.CATEGORY_MASK));
            map.put("rosybrown", -4419697);
            map.put("royalblue", -12490271);
            map.put("saddlebrown", -7650029);
            map.put("salmon", -360334);
            map.put("sandybrown", -744352);
            map.put("seagreen", -13726889);
            map.put("seashell", -2578);
            map.put("sienna", -6270419);
            map.put("silver", -4144960);
            map.put("skyblue", -7876885);
            map.put("slateblue", -9807155);
            map.put("slategray", -9404272);
            map.put("slategrey", -9404272);
            map.put("snow", -1286);
            map.put("springgreen", -16711809);
            map.put("steelblue", -12156236);
            map.put("tan", -2968436);
            map.put("teal", -16744320);
            map.put("thistle", -2572328);
            map.put("tomato", -40121);
            map.put("turquoise", -12525360);
            map.put("violet", -1146130);
            map.put("wheat", -663885);
            map.put("white", -1);
            map.put("whitesmoke", -657931);
            map.put("yellow", Integer.valueOf(InputDeviceCompat.SOURCE_ANY));
            map.put("yellowgreen", -6632142);
            map.put("transparent", 0);
        }

        public static Integer KWHzl(String str) {
            return EZpvd.get(str);
        }
    }

    public static class ActionBar {
        public static final Map<String, SVG.PictureInPictureParams> copydefault;

        private ActionBar() {
        }

        static {
            HashMap map = new HashMap(9);
            copydefault = map;
            SVG.Unit unit = SVG.Unit.pt;
            map.put("xx-small", new SVG.PictureInPictureParams(0.694f, unit));
            map.put("x-small", new SVG.PictureInPictureParams(0.833f, unit));
            map.put("small", new SVG.PictureInPictureParams(10.0f, unit));
            map.put("medium", new SVG.PictureInPictureParams(12.0f, unit));
            map.put("large", new SVG.PictureInPictureParams(14.4f, unit));
            map.put("x-large", new SVG.PictureInPictureParams(17.3f, unit));
            map.put("xx-large", new SVG.PictureInPictureParams(20.7f, unit));
            SVG.Unit unit2 = SVG.Unit.percent;
            map.put("smaller", new SVG.PictureInPictureParams(83.33f, unit2));
            map.put("larger", new SVG.PictureInPictureParams(120.0f, unit2));
        }

        public static SVG.PictureInPictureParams KWHzl(String str) {
            return copydefault.get(str);
        }
    }

    public static class Activity {
        public static final Map<String, Integer> AEQbTJ;

        private Activity() {
        }

        static {
            HashMap map = new HashMap(13);
            AEQbTJ = map;
            map.put("normal", 400);
            Integer numValueOf = Integer.valueOf(TypedValues.TransitionType.TYPE_DURATION);
            map.put(TtmlNode.BOLD, numValueOf);
            map.put("bolder", 1);
            map.put("lighter", -1);
            map.put("100", 100);
            map.put("200", 200);
            map.put("300", 300);
            map.put("400", 400);
            map.put("500", 500);
            map.put(MultiTransferSignData.MAX_INTERVAL, 600);
            map.put("700", numValueOf);
            map.put("800", 800);
            map.put("900", 900);
        }

        public static Integer AEQbTJ(String str) {
            return AEQbTJ.get(str);
        }
    }

    public static class StateListAnimator {
        public static final Map<String, PreserveAspectRatio.Alignment> OLrzqt;

        private StateListAnimator() {
        }

        static {
            HashMap map = new HashMap(10);
            OLrzqt = map;
            map.put("none", PreserveAspectRatio.Alignment.none);
            map.put("xMinYMin", PreserveAspectRatio.Alignment.xMinYMin);
            map.put("xMidYMin", PreserveAspectRatio.Alignment.xMidYMin);
            map.put("xMaxYMin", PreserveAspectRatio.Alignment.xMaxYMin);
            map.put("xMinYMid", PreserveAspectRatio.Alignment.xMinYMid);
            map.put("xMidYMid", PreserveAspectRatio.Alignment.xMidYMid);
            map.put("xMaxYMid", PreserveAspectRatio.Alignment.xMaxYMid);
            map.put("xMinYMax", PreserveAspectRatio.Alignment.xMinYMax);
            map.put("xMidYMax", PreserveAspectRatio.Alignment.xMidYMax);
            map.put("xMaxYMax", PreserveAspectRatio.Alignment.xMaxYMax);
        }

        public static PreserveAspectRatio.Alignment OLrzqt(String str) {
            return OLrzqt.get(str);
        }
    }

    public SVG KWHzl(InputStream inputStream, boolean z) throws SVGParseException {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i = inputStream.read();
            int i2 = inputStream.read();
            inputStream.reset();
            if (i + (i2 << 8) == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            OLrzqt(inputStream, z);
            return this.djBIcL;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        }
    }

    public class FragmentManager implements Attributes {
        public XmlPullParser OLrzqt;

        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str, String str2) {
            return null;
        }

        public FragmentManager(XmlPullParser xmlPullParser) {
            this.OLrzqt = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.OLrzqt.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i) {
            return this.OLrzqt.getAttributeNamespace(i);
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i) {
            return this.OLrzqt.getAttributeName(i);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i) {
            String attributeName = this.OLrzqt.getAttributeName(i);
            if (this.OLrzqt.getAttributePrefix(i) == null) {
                return attributeName;
            }
            return this.OLrzqt.getAttributePrefix(i) + AbstractJsonLexerKt.COLON + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(int i) {
            return this.OLrzqt.getAttributeValue(i);
        }
    }

    public final void OLrzqt(InputStream inputStream, boolean z) throws SVGParseException {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                FragmentManager fragmentManager = new FragmentManager(xmlPullParserNewPullParser);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        OLrzqt();
                    } else if (eventType == 8) {
                        xmlPullParserNewPullParser.getText();
                        Dialog dialog = new Dialog(xmlPullParserNewPullParser.getText());
                        copydefault(dialog.uzCIH(), EZpvd(dialog));
                    } else if (eventType == 10) {
                        if (z && this.djBIcL.EZpvd() == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                inputStream.reset();
                                AEQbTJ(inputStream);
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + AbstractJsonLexerKt.COLON + name;
                        }
                        EZpvd(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, fragmentManager);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + AbstractJsonLexerKt.COLON + name2;
                        }
                        AEQbTJ(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        copydefault(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        sSMYrx(xmlPullParserNewPullParser.getText());
                    }
                }
                AEQbTJ();
            } catch (IOException e) {
                throw new SVGParseException("Stream error", e);
            }
        } catch (XmlPullParserException e2) {
            throw new SVGParseException("XML parser problem", e2);
        }
    }

    public final void AEQbTJ(InputStream inputStream) throws SVGParseException {
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            Application application = new Application(this, null);
            xMLReader.setContentHandler(application);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", application);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e) {
            throw new SVGParseException("Stream error", e);
        } catch (ParserConfigurationException e2) {
            throw new SVGParseException("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new SVGParseException("SVG parse error", e3);
        }
    }

    public class Application extends DefaultHandler2 {
        public Application() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.caverock.androidsvg.SVGParser) A[MD:(com.caverock.androidsvg.SVGParser):void (m)] (LINE:811) call: com.caverock.androidsvg.SVGParser.Application.<init>(com.caverock.androidsvg.SVGParser):void type: THIS */
        public /* synthetic */ Application(SVGParser sVGParser, AnonymousClass4 anonymousClass4) {
            this();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() throws SAXException {
            SVGParser.this.OLrzqt();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            SVGParser.this.EZpvd(str, str2, str3, attributes);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) throws SAXException {
            SVGParser.this.sSMYrx(new String(cArr, i, i2));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            SVGParser.this.AEQbTJ(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() throws SAXException {
            SVGParser.this.AEQbTJ();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) throws SAXException {
            SVGParser.this.copydefault(str, (Map<String, String>) SVGParser.this.EZpvd(new Dialog(str2)));
        }
    }

    public final void OLrzqt() {
        this.djBIcL = new SVG();
    }

    public final void EZpvd(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
        if (this.KWHzl) {
            this.AEQbTJ++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            SVGElem sVGElemFromString = SVGElem.fromString(str2);
            switch (AnonymousClass4.EZpvd[sVGElemFromString.ordinal()]) {
                case 1:
                    fJNWhG(attributes);
                    break;
                case 2:
                case 3:
                    EZpvd(attributes);
                    break;
                case 4:
                    KWHzl(attributes);
                    break;
                case 5:
                    AuCTelauCTel(attributes);
                    break;
                case 6:
                    isConnected(attributes);
                    break;
                case 7:
                    fIwbmz(attributes);
                    break;
                case 8:
                    AEQbTJ(attributes);
                    break;
                case 9:
                    copydefault(attributes);
                    break;
                case 10:
                    djBIcL(attributes);
                    break;
                case 11:
                    DbNXlk(attributes);
                    break;
                case 12:
                    values(attributes);
                    break;
                case 13:
                    uzCIH(attributes);
                    break;
                case 14:
                    iwGUEr(attributes);
                    break;
                case 15:
                    getNewProxyInstance(attributes);
                    break;
                case 16:
                    wlaJM(attributes);
                    break;
                case 17:
                    hDKMBd(attributes);
                    break;
                case 18:
                    AYXKKw(attributes);
                    break;
                case 19:
                    valueOf(attributes);
                    break;
                case 20:
                    fetchVPNInfo(attributes);
                    break;
                case 21:
                    ejfBZ(attributes);
                    break;
                case 22:
                case 23:
                    this.EZpvd = true;
                    this.gEmmrt = sVGElemFromString;
                    break;
                case 24:
                    OLrzqt(attributes);
                    break;
                case 25:
                    getFieldNames(attributes);
                    break;
                case 26:
                    AkhnZx(attributes);
                    break;
                case 27:
                    AhwBna(attributes);
                    break;
                case 28:
                    zsXlph(attributes);
                    break;
                case 29:
                    gEmmrt(attributes);
                    break;
                case 30:
                    fARcdN(attributes);
                    break;
                case 31:
                    AuCTel(attributes);
                    break;
                default:
                    this.KWHzl = true;
                    this.AEQbTJ = 1;
                    break;
            }
        }
    }

    public final void sSMYrx(String str) throws SVGParseException {
        if (this.KWHzl) {
            return;
        }
        if (this.EZpvd) {
            if (this.AhwBna == null) {
                this.AhwBna = new StringBuilder(str.length());
            }
            this.AhwBna.append(str);
        } else if (this.copydefault) {
            if (this.AYXKKw == null) {
                this.AYXKKw = new StringBuilder(str.length());
            }
            this.AYXKKw.append(str);
        } else if (this.OLrzqt instanceof SVG.Matrix) {
            zLjUOn(str);
        }
    }

    public final void copydefault(char[] cArr, int i, int i2) throws SVGParseException {
        if (this.KWHzl) {
            return;
        }
        if (this.EZpvd) {
            if (this.AhwBna == null) {
                this.AhwBna = new StringBuilder(i2);
            }
            this.AhwBna.append(cArr, i, i2);
        } else if (this.copydefault) {
            if (this.AYXKKw == null) {
                this.AYXKKw = new StringBuilder(i2);
            }
            this.AYXKKw.append(cArr, i, i2);
        } else if (this.OLrzqt instanceof SVG.Matrix) {
            zLjUOn(new String(cArr, i, i2));
        }
    }

    public final void zLjUOn(String str) throws SVGParseException {
        SVG.Configuration configuration = (SVG.Configuration) this.OLrzqt;
        int size = configuration.AYXKKw.size();
        SVG.Resources resources = size == 0 ? null : configuration.AYXKKw.get(size - 1);
        if (resources instanceof SVG.Callback) {
            StringBuilder sb = new StringBuilder();
            SVG.Callback callback = (SVG.Callback) resources;
            sb.append(callback.AEQbTJ);
            sb.append(str);
            callback.AEQbTJ = sb.toString();
            return;
        }
        this.OLrzqt.KWHzl(new SVG.Callback(str));
    }

    public final void AEQbTJ(String str, String str2, String str3) throws SVGParseException {
        if (this.KWHzl) {
            int i = this.AEQbTJ - 1;
            this.AEQbTJ = i;
            if (i == 0) {
                this.KWHzl = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i2 = AnonymousClass4.EZpvd[SVGElem.fromString(str2).ordinal()];
            if (i2 != 1 && i2 != 2 && i2 != 4 && i2 != 5 && i2 != 13 && i2 != 14) {
                switch (i2) {
                    case 22:
                    case 23:
                        this.EZpvd = false;
                        StringBuilder sb = this.AhwBna;
                        if (sb != null) {
                            SVGElem sVGElem = this.gEmmrt;
                            if (sVGElem == SVGElem.title) {
                                this.djBIcL.AEQbTJ(sb.toString());
                            } else if (sVGElem == SVGElem.desc) {
                                this.djBIcL.EZpvd(sb.toString());
                            }
                            this.AhwBna.setLength(0);
                        }
                        break;
                    case 30:
                        StringBuilder sb2 = this.AYXKKw;
                        if (sb2 != null) {
                            this.copydefault = false;
                            AwvSrB(sb2.toString());
                            this.AYXKKw.setLength(0);
                        }
                        break;
                }
                return;
            }
            this.OLrzqt = ((SVG.Resources) this.OLrzqt).iwGUEr;
        }
    }

    public final void copydefault(String str, Map<String, String> map) {
        String str2;
        String strCopydefault;
        if (!str.equals("xml-stylesheet") || SVG.copydefault() == null) {
            return;
        }
        if (map.get("type") == null || "text/css".equals(map.get("type"))) {
            if ((map.get("alternate") != null && !"no".equals(map.get("alternate"))) || (str2 = map.get("href")) == null || (strCopydefault = SVG.copydefault().copydefault(str2)) == null) {
                return;
            }
            String str3 = map.get("media");
            if (str3 != null && !"all".equals(str3.trim())) {
                strCopydefault = "@media " + str3 + " { " + strCopydefault + "}";
            }
            AwvSrB(strCopydefault);
        }
    }

    public final Map<String, String> EZpvd(Dialog dialog) {
        HashMap map = new HashMap();
        dialog.zsXlph();
        String strAEQbTJ = dialog.AEQbTJ('=');
        while (strAEQbTJ != null) {
            dialog.KWHzl('=');
            map.put(strAEQbTJ, dialog.iwGUEr());
            dialog.zsXlph();
            strAEQbTJ = dialog.AEQbTJ('=');
        }
        return map;
    }

    public final void fJNWhG(Attributes attributes) throws SVGParseException {
        OLrzqt("<svg>", new Object[0]);
        SVG.SharedPreferences sharedPreferences = new SVG.SharedPreferences();
        sharedPreferences.getFieldNames = this.djBIcL;
        sharedPreferences.iwGUEr = this.OLrzqt;
        EZpvd(sharedPreferences, attributes);
        OLrzqt(sharedPreferences, attributes);
        KWHzl((SVG.ServiceConnection) sharedPreferences, attributes);
        KWHzl((SVG.Canvas) sharedPreferences, attributes);
        KWHzl(sharedPreferences, attributes);
        SVG.PackageManager packageManager = this.OLrzqt;
        if (packageManager == null) {
            this.djBIcL.copydefault(sharedPreferences);
        } else {
            packageManager.KWHzl(sharedPreferences);
        }
        this.OLrzqt = sharedPreferences;
    }

    public final void KWHzl(SVG.SharedPreferences sharedPreferences, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = AnonymousClass4.copydefault[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                sharedPreferences.EZpvd = AkhnZx(strTrim);
            } else if (i2 == 2) {
                sharedPreferences.copydefault = AkhnZx(strTrim);
            } else if (i2 == 3) {
                SVG.PictureInPictureParams pictureInPictureParamsAkhnZx = AkhnZx(strTrim);
                sharedPreferences.AEQbTJ = pictureInPictureParamsAkhnZx;
                if (pictureInPictureParamsAkhnZx.EZpvd()) {
                    throw new SVGParseException("Invalid <svg> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                SVG.PictureInPictureParams pictureInPictureParamsAkhnZx2 = AkhnZx(strTrim);
                sharedPreferences.KWHzl = pictureInPictureParamsAkhnZx2;
                if (pictureInPictureParamsAkhnZx2.EZpvd()) {
                    throw new SVGParseException("Invalid <svg> element. height cannot be negative");
                }
            } else if (i2 == 5) {
                sharedPreferences.OLrzqt = strTrim;
            }
        }
    }

    /* JADX INFO: renamed from: com.caverock.androidsvg.SVGParser$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[SVGAttr.values().length];
            copydefault = iArr;
            try {
                iArr[SVGAttr.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                copydefault[SVGAttr.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                copydefault[SVGAttr.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                copydefault[SVGAttr.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                copydefault[SVGAttr.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                copydefault[SVGAttr.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                copydefault[SVGAttr.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                copydefault[SVGAttr.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                copydefault[SVGAttr.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                copydefault[SVGAttr.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                copydefault[SVGAttr.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                copydefault[SVGAttr.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                copydefault[SVGAttr.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                copydefault[SVGAttr.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                copydefault[SVGAttr.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                copydefault[SVGAttr.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                copydefault[SVGAttr.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                copydefault[SVGAttr.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                copydefault[SVGAttr.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                copydefault[SVGAttr.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                copydefault[SVGAttr.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                copydefault[SVGAttr.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                copydefault[SVGAttr.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                copydefault[SVGAttr.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                copydefault[SVGAttr.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                copydefault[SVGAttr.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                copydefault[SVGAttr.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                copydefault[SVGAttr.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                copydefault[SVGAttr.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                copydefault[SVGAttr.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                copydefault[SVGAttr.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                copydefault[SVGAttr.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                copydefault[SVGAttr.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                copydefault[SVGAttr.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                copydefault[SVGAttr.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                copydefault[SVGAttr.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                copydefault[SVGAttr.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                copydefault[SVGAttr.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                copydefault[SVGAttr.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                copydefault[SVGAttr.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                copydefault[SVGAttr.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                copydefault[SVGAttr.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                copydefault[SVGAttr.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                copydefault[SVGAttr.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                copydefault[SVGAttr.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                copydefault[SVGAttr.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                copydefault[SVGAttr.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                copydefault[SVGAttr.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                copydefault[SVGAttr.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                copydefault[SVGAttr.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                copydefault[SVGAttr.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                copydefault[SVGAttr.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                copydefault[SVGAttr.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                copydefault[SVGAttr.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                copydefault[SVGAttr.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                copydefault[SVGAttr.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                copydefault[SVGAttr.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                copydefault[SVGAttr.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                copydefault[SVGAttr.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                copydefault[SVGAttr.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                copydefault[SVGAttr.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                copydefault[SVGAttr.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                copydefault[SVGAttr.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                copydefault[SVGAttr.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                copydefault[SVGAttr.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                copydefault[SVGAttr.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                copydefault[SVGAttr.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                copydefault[SVGAttr.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                copydefault[SVGAttr.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                copydefault[SVGAttr.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                copydefault[SVGAttr.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                copydefault[SVGAttr.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                copydefault[SVGAttr.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                copydefault[SVGAttr.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                copydefault[SVGAttr.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                copydefault[SVGAttr.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                copydefault[SVGAttr.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                copydefault[SVGAttr.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                copydefault[SVGAttr.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                copydefault[SVGAttr.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                copydefault[SVGAttr.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                copydefault[SVGAttr.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                copydefault[SVGAttr.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                copydefault[SVGAttr.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                copydefault[SVGAttr.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                copydefault[SVGAttr.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                copydefault[SVGAttr.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                copydefault[SVGAttr.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                copydefault[SVGAttr.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[SVGElem.values().length];
            EZpvd = iArr2;
            try {
                iArr2[SVGElem.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                EZpvd[SVGElem.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                EZpvd[SVGElem.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                EZpvd[SVGElem.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                EZpvd[SVGElem.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                EZpvd[SVGElem.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                EZpvd[SVGElem.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                EZpvd[SVGElem.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                EZpvd[SVGElem.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                EZpvd[SVGElem.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                EZpvd[SVGElem.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                EZpvd[SVGElem.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                EZpvd[SVGElem.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                EZpvd[SVGElem.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                EZpvd[SVGElem.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                EZpvd[SVGElem.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                EZpvd[SVGElem.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                EZpvd[SVGElem.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                EZpvd[SVGElem.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                EZpvd[SVGElem.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                EZpvd[SVGElem.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                EZpvd[SVGElem.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                EZpvd[SVGElem.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                EZpvd[SVGElem.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                EZpvd[SVGElem.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                EZpvd[SVGElem.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                EZpvd[SVGElem.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                EZpvd[SVGElem.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                EZpvd[SVGElem.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                EZpvd[SVGElem.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                EZpvd[SVGElem.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    public final void EZpvd(Attributes attributes) throws SVGParseException {
        OLrzqt("<g>", new Object[0]);
        if (this.OLrzqt == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.VoiceInteractor voiceInteractor = new SVG.VoiceInteractor();
        voiceInteractor.getFieldNames = this.djBIcL;
        voiceInteractor.iwGUEr = this.OLrzqt;
        EZpvd(voiceInteractor, attributes);
        OLrzqt(voiceInteractor, attributes);
        copydefault(voiceInteractor, attributes);
        KWHzl(voiceInteractor, attributes);
        this.OLrzqt.KWHzl(voiceInteractor);
        this.OLrzqt = voiceInteractor;
    }

    public final void KWHzl(Attributes attributes) throws SVGParseException {
        OLrzqt("<defs>", new Object[0]);
        if (this.OLrzqt == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.Dialog dialog = new SVG.Dialog();
        dialog.getFieldNames = this.djBIcL;
        dialog.iwGUEr = this.OLrzqt;
        EZpvd(dialog, attributes);
        OLrzqt(dialog, attributes);
        copydefault(dialog, attributes);
        this.OLrzqt.KWHzl(dialog);
        this.OLrzqt = dialog;
    }

    public final void AuCTelauCTel(Attributes attributes) throws SVGParseException {
        OLrzqt("<use>", new Object[0]);
        if (this.OLrzqt == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.MediaController mediaController = new SVG.MediaController();
        mediaController.getFieldNames = this.djBIcL;
        mediaController.iwGUEr = this.OLrzqt;
        EZpvd(mediaController, attributes);
        OLrzqt(mediaController, attributes);
        copydefault(mediaController, attributes);
        KWHzl(mediaController, attributes);
        AEQbTJ(mediaController, attributes);
        this.OLrzqt.KWHzl(mediaController);
        this.OLrzqt = mediaController;
    }

    public final void AEQbTJ(SVG.MediaController mediaController, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = AnonymousClass4.copydefault[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                mediaController.copydefault = AkhnZx(strTrim);
            } else if (i2 == 2) {
                mediaController.valueOf = AkhnZx(strTrim);
            } else if (i2 == 3) {
                SVG.PictureInPictureParams pictureInPictureParamsAkhnZx = AkhnZx(strTrim);
                mediaController.KWHzl = pictureInPictureParamsAkhnZx;
                if (pictureInPictureParamsAkhnZx.EZpvd()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                SVG.PictureInPictureParams pictureInPictureParamsAkhnZx2 = AkhnZx(strTrim);
                mediaController.OLrzqt = pictureInPictureParamsAkhnZx2;
                if (pictureInPictureParamsAkhnZx2.EZpvd()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i2 == 6 && ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i)))) {
                mediaController.AEQbTJ = strTrim;
            }
        }
    }

    public final void AhwBna(Attributes attributes) throws SVGParseException {
        OLrzqt("<image>", new Object[0]);
        if (this.OLrzqt == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.AssistContent assistContent = new SVG.AssistContent();
        assistContent.getFieldNames = this.djBIcL;
        assistContent.iwGUEr = this.OLrzqt;
        EZpvd((SVG.AssetManager) assistContent, attributes);
        OLrzqt(assistContent, attributes);
        copydefault(assistContent, attributes);
        KWHzl(assistContent, attributes);
        EZpvd(assistContent, attributes);
        this.OLrzqt.KWHzl(assistContent);
        this.OLrzqt = assistContent;
    }

    public final void EZpvd(SVG.AssistContent assistContent, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = AnonymousClass4.copydefault[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                assistContent.EZpvd = AkhnZx(strTrim);
            } else if (i2 == 2) {
                assistContent.valueOf = AkhnZx(strTrim);
            } else if (i2 == 3) {
                SVG.PictureInPictureParams pictureInPictureParamsAkhnZx = AkhnZx(strTrim);
                assistContent.OLrzqt = pictureInPictureParamsAkhnZx;
                if (pictureInPictureParamsAkhnZx.EZpvd()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                SVG.PictureInPictureParams pictureInPictureParamsAkhnZx2 = AkhnZx(strTrim);
                assistContent.copydefault = pictureInPictureParamsAkhnZx2;
                if (pictureInPictureParamsAkhnZx2.EZpvd()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i2 != 6) {
                if (i2 == 7) {
                    copydefault(assistContent, strTrim);
                }
            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                assistContent.AEQbTJ = strTrim;
            }
        }
    }

    public final void isConnected(Attributes attributes) throws SVGParseException {
        OLrzqt("<path>", new Object[0]);
        if (this.OLrzqt == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.BroadcastReceiver broadcastReceiver = new SVG.BroadcastReceiver();
        broadcastReceiver.getFieldNames = this.djBIcL;
        broadcastReceiver.iwGUEr = this.OLrzqt;
        EZpvd(broadcastReceiver, attributes);
        OLrzqt((SVG.AssetManager) broadcastReceiver, attributes);
        copydefault(broadcastReceiver, attributes);
        KWHzl(broadcastReceiver, attributes);
        OLrzqt(broadcastReceiver, attributes);
        this.OLrzqt.KWHzl(broadcastReceiver);
    }

    public final void OLrzqt(SVG.BroadcastReceiver broadcastReceiver, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = AnonymousClass4.copydefault[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 8) {
                broadcastReceiver.KWHzl = ejfBZ(strTrim);
            } else if (i2 != 9) {
                continue;
            } else {
                Float fValueOf = Float.valueOf(valueOf(strTrim));
                broadcastReceiver.EZpvd = fValueOf;
                if (fValueOf.floatValue() < 0.0f) {
                    throw new SVGParseException("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    public final void fIwbmz(Attributes attributes) throws SVGParseException {
        OLrzqt("<rect>", new Object[0]);
        if (this.OLrzqt == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.IntentSender intentSender = new SVG.IntentSender();
        intentSender.getFieldNames = this.djBIcL;
        intentSender.iwGUEr = this.OLrzqt;
        EZpvd(intentSender, attributes);
        OLrzqt(intentSender, attributes);
        copydefault((SVG.SharedElementCallback) intentSender, attributes);
        KWHzl(intentSender, attributes);
        copydefault(intentSender, attributes);
        this.OLrzqt.KWHzl(intentSender);
    }

    public final void copydefault(SVG.IntentSender intentSender, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = AnonymousClass4.copydefault[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                intentSender.AYXKKw = AkhnZx(strTrim);
            } else if (i2 == 2) {
                intentSender.valueOf = AkhnZx(strTrim);
            } else if (i2 == 3) {
                SVG.PictureInPictureParams pictureInPictureParamsAkhnZx = AkhnZx(strTrim);
                intentSender.KWHzl = pictureInPictureParamsAkhnZx;
                if (pictureInPictureParamsAkhnZx.EZpvd()) {
                    throw new SVGParseException("Invalid <rect> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                SVG.PictureInPictureParams pictureInPictureParamsAkhnZx2 = AkhnZx(strTrim);
                intentSender.EZpvd = pictureInPictureParamsAkhnZx2;
                if (pictureInPictureParamsAkhnZx2.EZpvd()) {
                    throw new SVGParseException("Invalid <rect> element. height cannot be negative");
                }
            } else if (i2 == 10) {
                SVG.PictureInPictureParams pictureInPictureParamsAkhnZx3 = AkhnZx(strTrim);
                intentSender.OLrzqt = pictureInPictureParamsAkhnZx3;
                if (pictureInPictureParamsAkhnZx3.EZpvd()) {
                    throw new SVGParseException("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i2 != 11) {
                continue;
            } else {
                SVG.PictureInPictureParams pictureInPictureParamsAkhnZx4 = AkhnZx(strTrim);
                intentSender.copydefault = pictureInPictureParamsAkhnZx4;
                if (pictureInPictureParamsAkhnZx4.EZpvd()) {
                    throw new SVGParseException("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    public final void AEQbTJ(Attributes attributes) throws SVGParseException {
        OLrzqt("<circle>", new Object[0]);
        if (this.OLrzqt == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.Application application = new SVG.Application();
        application.getFieldNames = this.djBIcL;
        application.iwGUEr = this.OLrzqt;
        EZpvd(application, attributes);
        OLrzqt(application, attributes);
        copydefault(application, attributes);
        KWHzl((SVG.ServiceConnection) application, attributes);
        KWHzl(application, attributes);
        this.OLrzqt.KWHzl(application);
    }

    public final void KWHzl(SVG.Application application, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            switch (AnonymousClass4.copydefault[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 12:
                    application.OLrzqt = AkhnZx(strTrim);
                    break;
                case 13:
                    application.EZpvd = AkhnZx(strTrim);
                    break;
                case 14:
                    SVG.PictureInPictureParams pictureInPictureParamsAkhnZx = AkhnZx(strTrim);
                    application.KWHzl = pictureInPictureParamsAkhnZx;
                    if (pictureInPictureParamsAkhnZx.EZpvd()) {
                        throw new SVGParseException("Invalid <circle> element. r cannot be negative");
                    }
                    break;
                    break;
            }
        }
    }

    public final void copydefault(Attributes attributes) throws SVGParseException {
        OLrzqt("<ellipse>", new Object[0]);
        if (this.OLrzqt == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.LoaderManager loaderManager = new SVG.LoaderManager();
        loaderManager.getFieldNames = this.djBIcL;
        loaderManager.iwGUEr = this.OLrzqt;
        EZpvd(loaderManager, attributes);
        OLrzqt((SVG.AssetManager) loaderManager, attributes);
        copydefault(loaderManager, attributes);
        KWHzl(loaderManager, attributes);
        OLrzqt(loaderManager, attributes);
        this.OLrzqt.KWHzl(loaderManager);
    }

    public final void OLrzqt(SVG.LoaderManager loaderManager, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            switch (AnonymousClass4.copydefault[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 10:
                    SVG.PictureInPictureParams pictureInPictureParamsAkhnZx = AkhnZx(strTrim);
                    loaderManager.KWHzl = pictureInPictureParamsAkhnZx;
                    if (pictureInPictureParamsAkhnZx.EZpvd()) {
                        throw new SVGParseException("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                    break;
                case 11:
                    SVG.PictureInPictureParams pictureInPictureParamsAkhnZx2 = AkhnZx(strTrim);
                    loaderManager.EZpvd = pictureInPictureParamsAkhnZx2;
                    if (pictureInPictureParamsAkhnZx2.EZpvd()) {
                        throw new SVGParseException("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                    break;
                case 12:
                    loaderManager.OLrzqt = AkhnZx(strTrim);
                    break;
                case 13:
                    loaderManager.copydefault = AkhnZx(strTrim);
                    break;
            }
        }
    }

    public final void djBIcL(Attributes attributes) throws SVGParseException {
        OLrzqt("<line>", new Object[0]);
        if (this.OLrzqt == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.TaskStackBuilder taskStackBuilder = new SVG.TaskStackBuilder();
        taskStackBuilder.getFieldNames = this.djBIcL;
        taskStackBuilder.iwGUEr = this.OLrzqt;
        EZpvd(taskStackBuilder, attributes);
        OLrzqt((SVG.AssetManager) taskStackBuilder, attributes);
        copydefault(taskStackBuilder, attributes);
        KWHzl(taskStackBuilder, attributes);
        OLrzqt(taskStackBuilder, attributes);
        this.OLrzqt.KWHzl(taskStackBuilder);
    }

    public final void OLrzqt(SVG.TaskStackBuilder taskStackBuilder, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            switch (AnonymousClass4.copydefault[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 15:
                    taskStackBuilder.EZpvd = AkhnZx(strTrim);
                    break;
                case 16:
                    taskStackBuilder.OLrzqt = AkhnZx(strTrim);
                    break;
                case 17:
                    taskStackBuilder.KWHzl = AkhnZx(strTrim);
                    break;
                case 18:
                    taskStackBuilder.copydefault = AkhnZx(strTrim);
                    break;
            }
        }
    }

    public final void DbNXlk(Attributes attributes) throws SVGParseException {
        OLrzqt("<polyline>", new Object[0]);
        if (this.OLrzqt == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.ContentResolver contentResolver = new SVG.ContentResolver();
        contentResolver.getFieldNames = this.djBIcL;
        contentResolver.iwGUEr = this.OLrzqt;
        EZpvd(contentResolver, attributes);
        OLrzqt(contentResolver, attributes);
        copydefault(contentResolver, attributes);
        KWHzl(contentResolver, attributes);
        KWHzl(contentResolver, attributes, "polyline");
        this.OLrzqt.KWHzl(contentResolver);
    }

    public final void KWHzl(SVG.ContentResolver contentResolver, Attributes attributes, String str) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.points) {
                Dialog dialog = new Dialog(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                dialog.zsXlph();
                while (!dialog.isConnected()) {
                    float fFIwbmz = dialog.fIwbmz();
                    if (Float.isNaN(fFIwbmz)) {
                        throw new SVGParseException("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    dialog.AubY();
                    float fFIwbmz2 = dialog.fIwbmz();
                    if (Float.isNaN(fFIwbmz2)) {
                        throw new SVGParseException("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    dialog.AubY();
                    arrayList.add(Float.valueOf(fFIwbmz));
                    arrayList.add(Float.valueOf(fFIwbmz2));
                }
                contentResolver.KWHzl = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    contentResolver.KWHzl[i2] = ((Float) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    public final void values(Attributes attributes) throws SVGParseException {
        OLrzqt("<polygon>", new Object[0]);
        if (this.OLrzqt == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.ContentResolver contextWrapper = new SVG.ContextWrapper();
        contextWrapper.getFieldNames = this.djBIcL;
        contextWrapper.iwGUEr = this.OLrzqt;
        EZpvd(contextWrapper, attributes);
        OLrzqt(contextWrapper, attributes);
        copydefault(contextWrapper, attributes);
        KWHzl(contextWrapper, attributes);
        KWHzl(contextWrapper, attributes, "polygon");
        this.OLrzqt.KWHzl(contextWrapper);
    }

    public final void uzCIH(Attributes attributes) throws SVGParseException {
        OLrzqt("<text>", new Object[0]);
        if (this.OLrzqt == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.Mode mode = new SVG.Mode();
        mode.getFieldNames = this.djBIcL;
        mode.iwGUEr = this.OLrzqt;
        EZpvd((SVG.AssetManager) mode, attributes);
        OLrzqt(mode, attributes);
        copydefault(mode, attributes);
        KWHzl(mode, attributes);
        EZpvd((SVG.Paint) mode, attributes);
        this.OLrzqt.KWHzl(mode);
        this.OLrzqt = mode;
    }

    public final void EZpvd(SVG.Paint paint, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = AnonymousClass4.copydefault[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                paint.KWHzl = isConnected(strTrim);
            } else if (i2 == 2) {
                paint.EZpvd = isConnected(strTrim);
            } else if (i2 == 19) {
                paint.OLrzqt = isConnected(strTrim);
            } else if (i2 == 20) {
                paint.AEQbTJ = isConnected(strTrim);
            }
        }
    }

    public final void iwGUEr(Attributes attributes) throws SVGParseException {
        OLrzqt("<tspan>", new Object[0]);
        SVG.PackageManager packageManager = this.OLrzqt;
        if (packageManager == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(packageManager instanceof SVG.Matrix)) {
            throw new SVGParseException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        SVG.SQLiteDatabase sQLiteDatabase = new SVG.SQLiteDatabase();
        sQLiteDatabase.getFieldNames = this.djBIcL;
        sQLiteDatabase.iwGUEr = this.OLrzqt;
        EZpvd((SVG.AssetManager) sQLiteDatabase, attributes);
        OLrzqt(sQLiteDatabase, attributes);
        KWHzl(sQLiteDatabase, attributes);
        EZpvd((SVG.Paint) sQLiteDatabase, attributes);
        this.OLrzqt.KWHzl(sQLiteDatabase);
        this.OLrzqt = sQLiteDatabase;
        SVG.PackageManager packageManager2 = sQLiteDatabase.iwGUEr;
        if (packageManager2 instanceof SVG.Uri) {
            sQLiteDatabase.OLrzqt((SVG.Uri) packageManager2);
        } else {
            sQLiteDatabase.OLrzqt(((SVG.Rect) packageManager2).gEmmrt());
        }
    }

    public final void getNewProxyInstance(Attributes attributes) throws SVGParseException {
        OLrzqt("<tref>", new Object[0]);
        SVG.PackageManager packageManager = this.OLrzqt;
        if (packageManager == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(packageManager instanceof SVG.Matrix)) {
            throw new SVGParseException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        SVG.SQLiteClosable sQLiteClosable = new SVG.SQLiteClosable();
        sQLiteClosable.getFieldNames = this.djBIcL;
        sQLiteClosable.iwGUEr = this.OLrzqt;
        EZpvd(sQLiteClosable, attributes);
        OLrzqt((SVG.AssetManager) sQLiteClosable, attributes);
        KWHzl(sQLiteClosable, attributes);
        OLrzqt(sQLiteClosable, attributes);
        this.OLrzqt.KWHzl(sQLiteClosable);
        SVG.PackageManager packageManager2 = sQLiteClosable.iwGUEr;
        if (packageManager2 instanceof SVG.Uri) {
            sQLiteClosable.KWHzl((SVG.Uri) packageManager2);
        } else {
            sQLiteClosable.KWHzl(((SVG.Rect) packageManager2).gEmmrt());
        }
    }

    public final void OLrzqt(SVG.SQLiteClosable sQLiteClosable, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (AnonymousClass4.copydefault[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()] == 6 && ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i)))) {
                sQLiteClosable.KWHzl = strTrim;
            }
        }
    }

    public final void wlaJM(Attributes attributes) throws SVGParseException {
        OLrzqt("<switch>", new Object[0]);
        if (this.OLrzqt == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.Bitmap bitmap = new SVG.Bitmap();
        bitmap.getFieldNames = this.djBIcL;
        bitmap.iwGUEr = this.OLrzqt;
        EZpvd(bitmap, attributes);
        OLrzqt(bitmap, attributes);
        copydefault(bitmap, attributes);
        KWHzl(bitmap, attributes);
        this.OLrzqt.KWHzl(bitmap);
        this.OLrzqt = bitmap;
    }

    public final void KWHzl(SVG.ServiceConnection serviceConnection, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            switch (AnonymousClass4.copydefault[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 21:
                    serviceConnection.AEQbTJ(AuCTel(strTrim));
                    break;
                case 22:
                    serviceConnection.EZpvd(strTrim);
                    break;
                case 23:
                    serviceConnection.EZpvd(getNewProxyInstance(strTrim));
                    break;
                case 24:
                    serviceConnection.OLrzqt(fIwbmz(strTrim));
                    break;
                case 25:
                    List<String> listGEmmrt = gEmmrt(strTrim);
                    serviceConnection.copydefault(listGEmmrt != null ? new HashSet(listGEmmrt) : new HashSet(0));
                    break;
            }
        }
    }

    public final void hDKMBd(Attributes attributes) throws SVGParseException {
        OLrzqt("<symbol>", new Object[0]);
        if (this.OLrzqt == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.Canvas cursorFactory = new SVG.CursorFactory();
        cursorFactory.getFieldNames = this.djBIcL;
        cursorFactory.iwGUEr = this.OLrzqt;
        EZpvd(cursorFactory, attributes);
        OLrzqt(cursorFactory, attributes);
        KWHzl((SVG.ServiceConnection) cursorFactory, attributes);
        KWHzl(cursorFactory, attributes);
        this.OLrzqt.KWHzl(cursorFactory);
        this.OLrzqt = cursorFactory;
    }

    public final void AYXKKw(Attributes attributes) throws SVGParseException {
        OLrzqt("<marker>", new Object[0]);
        if (this.OLrzqt == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.ComponentCallbacks componentCallbacks = new SVG.ComponentCallbacks();
        componentCallbacks.getFieldNames = this.djBIcL;
        componentCallbacks.iwGUEr = this.OLrzqt;
        EZpvd(componentCallbacks, attributes);
        OLrzqt(componentCallbacks, attributes);
        KWHzl((SVG.ServiceConnection) componentCallbacks, attributes);
        KWHzl((SVG.Canvas) componentCallbacks, attributes);
        KWHzl(componentCallbacks, attributes);
        this.OLrzqt.KWHzl(componentCallbacks);
        this.OLrzqt = componentCallbacks;
    }

    public final void KWHzl(SVG.ComponentCallbacks componentCallbacks, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            switch (AnonymousClass4.copydefault[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 26:
                    componentCallbacks.copydefault = AkhnZx(strTrim);
                    break;
                case 27:
                    componentCallbacks.AhwBna = AkhnZx(strTrim);
                    break;
                case 28:
                    SVG.PictureInPictureParams pictureInPictureParamsAkhnZx = AkhnZx(strTrim);
                    componentCallbacks.KWHzl = pictureInPictureParamsAkhnZx;
                    if (pictureInPictureParamsAkhnZx.EZpvd()) {
                        throw new SVGParseException("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                    break;
                case 29:
                    SVG.PictureInPictureParams pictureInPictureParamsAkhnZx2 = AkhnZx(strTrim);
                    componentCallbacks.AEQbTJ = pictureInPictureParamsAkhnZx2;
                    if (pictureInPictureParamsAkhnZx2.EZpvd()) {
                        throw new SVGParseException("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                    break;
                case 30:
                    if ("strokeWidth".equals(strTrim)) {
                        componentCallbacks.OLrzqt = false;
                    } else if ("userSpaceOnUse".equals(strTrim)) {
                        componentCallbacks.OLrzqt = true;
                    } else {
                        throw new SVGParseException("Invalid value for attribute markerUnits");
                    }
                    break;
                case 31:
                    if (DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(strTrim)) {
                        componentCallbacks.EZpvd = Float.valueOf(Float.NaN);
                    } else {
                        componentCallbacks.EZpvd = Float.valueOf(valueOf(strTrim));
                    }
                    break;
            }
        }
    }

    public final void valueOf(Attributes attributes) throws SVGParseException {
        OLrzqt("<linearGradient>", new Object[0]);
        if (this.OLrzqt == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.DatabaseErrorHandler databaseErrorHandler = new SVG.DatabaseErrorHandler();
        databaseErrorHandler.getFieldNames = this.djBIcL;
        databaseErrorHandler.iwGUEr = this.OLrzqt;
        EZpvd(databaseErrorHandler, attributes);
        OLrzqt(databaseErrorHandler, attributes);
        AEQbTJ(databaseErrorHandler, attributes);
        KWHzl(databaseErrorHandler, attributes);
        this.OLrzqt.KWHzl(databaseErrorHandler);
        this.OLrzqt = databaseErrorHandler;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(SVG.FragmentManager fragmentManager, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = AnonymousClass4.copydefault[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 != 6) {
                switch (i2) {
                    case 32:
                        if ("objectBoundingBox".equals(strTrim)) {
                            fragmentManager.EZpvd = Boolean.FALSE;
                        } else if ("userSpaceOnUse".equals(strTrim)) {
                            fragmentManager.EZpvd = Boolean.TRUE;
                        } else {
                            throw new SVGParseException("Invalid value for attribute gradientUnits");
                        }
                        break;
                    case 33:
                        fragmentManager.AEQbTJ = zuBGHE(strTrim);
                        break;
                    case 34:
                        try {
                            fragmentManager.KWHzl = SVG.GradientSpread.valueOf(strTrim);
                        } catch (IllegalArgumentException unused) {
                            throw new SVGParseException("Invalid spreadMethod attribute. \"" + strTrim + "\" is not a valid value.");
                        }
                        break;
                }
            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                fragmentManager.OLrzqt = strTrim;
            }
        }
    }

    public final void KWHzl(SVG.DatabaseErrorHandler databaseErrorHandler, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            switch (AnonymousClass4.copydefault[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 15:
                    databaseErrorHandler.valueOf = AkhnZx(strTrim);
                    break;
                case 16:
                    databaseErrorHandler.AhwBna = AkhnZx(strTrim);
                    break;
                case 17:
                    databaseErrorHandler.gEmmrt = AkhnZx(strTrim);
                    break;
                case 18:
                    databaseErrorHandler.AYXKKw = AkhnZx(strTrim);
                    break;
            }
        }
    }

    public final void fetchVPNInfo(Attributes attributes) throws SVGParseException {
        OLrzqt("<radialGradient>", new Object[0]);
        if (this.OLrzqt == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.Theme theme = new SVG.Theme();
        theme.getFieldNames = this.djBIcL;
        theme.iwGUEr = this.OLrzqt;
        EZpvd(theme, attributes);
        OLrzqt((SVG.AssetManager) theme, attributes);
        AEQbTJ(theme, attributes);
        OLrzqt(theme, attributes);
        this.OLrzqt.KWHzl(theme);
        this.OLrzqt = theme;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(SVG.Theme theme, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = AnonymousClass4.copydefault[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 35) {
                theme.AYXKKw = AkhnZx(strTrim);
            } else if (i2 != 36) {
                switch (i2) {
                    case 12:
                        theme.djBIcL = AkhnZx(strTrim);
                        break;
                    case 13:
                        theme.valueOf = AkhnZx(strTrim);
                        break;
                    case 14:
                        SVG.PictureInPictureParams pictureInPictureParamsAkhnZx = AkhnZx(strTrim);
                        theme.AhwBna = pictureInPictureParamsAkhnZx;
                        if (pictureInPictureParamsAkhnZx.EZpvd()) {
                            throw new SVGParseException("Invalid <radialGradient> element. r cannot be negative");
                        }
                        break;
                        break;
                }
            } else {
                theme.gEmmrt = AkhnZx(strTrim);
            }
        }
    }

    public final void ejfBZ(Attributes attributes) throws SVGParseException {
        OLrzqt("<stop>", new Object[0]);
        SVG.PackageManager packageManager = this.OLrzqt;
        if (packageManager == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(packageManager instanceof SVG.FragmentManager)) {
            throw new SVGParseException("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        SVG.ApplicationInfo applicationInfo = new SVG.ApplicationInfo();
        applicationInfo.getFieldNames = this.djBIcL;
        applicationInfo.iwGUEr = this.OLrzqt;
        EZpvd(applicationInfo, attributes);
        OLrzqt((SVG.AssetManager) applicationInfo, attributes);
        OLrzqt(applicationInfo, attributes);
        this.OLrzqt.KWHzl(applicationInfo);
        this.OLrzqt = applicationInfo;
    }

    public final void OLrzqt(SVG.ApplicationInfo applicationInfo, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (AnonymousClass4.copydefault[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()] == 37) {
                applicationInfo.copydefault = gHZMYf(strTrim);
            }
        }
    }

    public final Float gHZMYf(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        boolean z = true;
        if (str.charAt(str.length() - 1) == '%') {
            length--;
        } else {
            z = false;
        }
        try {
            float fKWHzl = KWHzl(str, 0, length);
            float f = 100.0f;
            if (z) {
                fKWHzl /= 100.0f;
            }
            if (fKWHzl < 0.0f) {
                f = 0.0f;
            } else if (fKWHzl <= 100.0f) {
                f = fKWHzl;
            }
            return Float.valueOf(f);
        } catch (NumberFormatException e) {
            throw new SVGParseException("Invalid offset value in <stop>: " + str, e);
        }
    }

    public final void AuCTel(Attributes attributes) throws SVGParseException {
        OLrzqt("<solidColor>", new Object[0]);
        if (this.OLrzqt == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.IntentFilter intentFilter = new SVG.IntentFilter();
        intentFilter.getFieldNames = this.djBIcL;
        intentFilter.iwGUEr = this.OLrzqt;
        EZpvd(intentFilter, attributes);
        OLrzqt(intentFilter, attributes);
        this.OLrzqt.KWHzl(intentFilter);
        this.OLrzqt = intentFilter;
    }

    public final void OLrzqt(Attributes attributes) throws SVGParseException {
        OLrzqt("<clipPath>", new Object[0]);
        if (this.OLrzqt == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.StateListAnimator stateListAnimator = new SVG.StateListAnimator();
        stateListAnimator.getFieldNames = this.djBIcL;
        stateListAnimator.iwGUEr = this.OLrzqt;
        EZpvd(stateListAnimator, attributes);
        OLrzqt((SVG.AssetManager) stateListAnimator, attributes);
        copydefault(stateListAnimator, attributes);
        KWHzl(stateListAnimator, attributes);
        OLrzqt(stateListAnimator, attributes);
        this.OLrzqt.KWHzl(stateListAnimator);
        this.OLrzqt = stateListAnimator;
    }

    public final void OLrzqt(SVG.StateListAnimator stateListAnimator, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (AnonymousClass4.copydefault[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(strTrim)) {
                    stateListAnimator.KWHzl = Boolean.FALSE;
                } else if ("userSpaceOnUse".equals(strTrim)) {
                    stateListAnimator.KWHzl = Boolean.TRUE;
                } else {
                    throw new SVGParseException("Invalid value for attribute clipPathUnits");
                }
            }
        }
    }

    public final void getFieldNames(Attributes attributes) throws SVGParseException {
        OLrzqt("<textPath>", new Object[0]);
        if (this.OLrzqt == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.Point point = new SVG.Point();
        point.getFieldNames = this.djBIcL;
        point.iwGUEr = this.OLrzqt;
        EZpvd(point, attributes);
        OLrzqt((SVG.AssetManager) point, attributes);
        KWHzl(point, attributes);
        OLrzqt(point, attributes);
        this.OLrzqt.KWHzl(point);
        this.OLrzqt = point;
        SVG.PackageManager packageManager = point.iwGUEr;
        if (packageManager instanceof SVG.Uri) {
            point.EZpvd((SVG.Uri) packageManager);
        } else {
            point.EZpvd(((SVG.Rect) packageManager).gEmmrt());
        }
    }

    public final void OLrzqt(SVG.Point point, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = AnonymousClass4.copydefault[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 != 6) {
                if (i2 == 39) {
                    point.EZpvd = AkhnZx(strTrim);
                }
            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                point.AEQbTJ = strTrim;
            }
        }
    }

    public final void AkhnZx(Attributes attributes) throws SVGParseException {
        OLrzqt("<pattern>", new Object[0]);
        if (this.OLrzqt == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.DialogInterface dialogInterface = new SVG.DialogInterface();
        dialogInterface.getFieldNames = this.djBIcL;
        dialogInterface.iwGUEr = this.OLrzqt;
        EZpvd(dialogInterface, attributes);
        OLrzqt(dialogInterface, attributes);
        KWHzl((SVG.ServiceConnection) dialogInterface, attributes);
        KWHzl((SVG.Canvas) dialogInterface, attributes);
        AEQbTJ(dialogInterface, attributes);
        this.OLrzqt.KWHzl(dialogInterface);
        this.OLrzqt = dialogInterface;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cf, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(SVG.DialogInterface dialogInterface, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = AnonymousClass4.copydefault[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                dialogInterface.gEmmrt = AkhnZx(strTrim);
            } else if (i2 == 2) {
                dialogInterface.djBIcL = AkhnZx(strTrim);
            } else if (i2 == 3) {
                SVG.PictureInPictureParams pictureInPictureParamsAkhnZx = AkhnZx(strTrim);
                dialogInterface.valueOf = pictureInPictureParamsAkhnZx;
                if (pictureInPictureParamsAkhnZx.EZpvd()) {
                    throw new SVGParseException("Invalid <pattern> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                SVG.PictureInPictureParams pictureInPictureParamsAkhnZx2 = AkhnZx(strTrim);
                dialogInterface.AEQbTJ = pictureInPictureParamsAkhnZx2;
                if (pictureInPictureParamsAkhnZx2.EZpvd()) {
                    throw new SVGParseException("Invalid <pattern> element. height cannot be negative");
                }
            } else if (i2 != 6) {
                switch (i2) {
                    case 40:
                        if ("objectBoundingBox".equals(strTrim)) {
                            dialogInterface.EZpvd = Boolean.FALSE;
                        } else if ("userSpaceOnUse".equals(strTrim)) {
                            dialogInterface.EZpvd = Boolean.TRUE;
                        } else {
                            throw new SVGParseException("Invalid value for attribute patternUnits");
                        }
                        break;
                    case 41:
                        if ("objectBoundingBox".equals(strTrim)) {
                            dialogInterface.KWHzl = Boolean.FALSE;
                        } else if ("userSpaceOnUse".equals(strTrim)) {
                            dialogInterface.KWHzl = Boolean.TRUE;
                        } else {
                            throw new SVGParseException("Invalid value for attribute patternContentUnits");
                        }
                        break;
                    case 42:
                        dialogInterface.copydefault = zuBGHE(strTrim);
                        break;
                }
            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                dialogInterface.OLrzqt = strTrim;
            }
        }
    }

    public final void zsXlph(Attributes attributes) throws SVGParseException {
        OLrzqt("<view>", new Object[0]);
        if (this.OLrzqt == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.Canvas drawable = new SVG.Drawable();
        drawable.getFieldNames = this.djBIcL;
        drawable.iwGUEr = this.OLrzqt;
        EZpvd(drawable, attributes);
        KWHzl((SVG.ServiceConnection) drawable, attributes);
        KWHzl(drawable, attributes);
        this.OLrzqt.KWHzl(drawable);
        this.OLrzqt = drawable;
    }

    public final void gEmmrt(Attributes attributes) throws SVGParseException {
        OLrzqt("<mask>", new Object[0]);
        if (this.OLrzqt == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.ClipData clipData = new SVG.ClipData();
        clipData.getFieldNames = this.djBIcL;
        clipData.iwGUEr = this.OLrzqt;
        EZpvd(clipData, attributes);
        OLrzqt((SVG.AssetManager) clipData, attributes);
        KWHzl(clipData, attributes);
        OLrzqt(clipData, attributes);
        this.OLrzqt.KWHzl(clipData);
        this.OLrzqt = clipData;
    }

    public final void OLrzqt(SVG.ClipData clipData, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = AnonymousClass4.copydefault[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                clipData.OLrzqt = AkhnZx(strTrim);
            } else if (i2 == 2) {
                clipData.valueOf = AkhnZx(strTrim);
            } else if (i2 == 3) {
                SVG.PictureInPictureParams pictureInPictureParamsAkhnZx = AkhnZx(strTrim);
                clipData.AEQbTJ = pictureInPictureParamsAkhnZx;
                if (pictureInPictureParamsAkhnZx.EZpvd()) {
                    throw new SVGParseException("Invalid <mask> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                SVG.PictureInPictureParams pictureInPictureParamsAkhnZx2 = AkhnZx(strTrim);
                clipData.copydefault = pictureInPictureParamsAkhnZx2;
                if (pictureInPictureParamsAkhnZx2.EZpvd()) {
                    throw new SVGParseException("Invalid <mask> element. height cannot be negative");
                }
            } else if (i2 != 43) {
                if (i2 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(strTrim)) {
                    clipData.KWHzl = Boolean.FALSE;
                } else if ("userSpaceOnUse".equals(strTrim)) {
                    clipData.KWHzl = Boolean.TRUE;
                } else {
                    throw new SVGParseException("Invalid value for attribute maskContentUnits");
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                clipData.EZpvd = Boolean.FALSE;
            } else if ("userSpaceOnUse".equals(strTrim)) {
                clipData.EZpvd = Boolean.TRUE;
            } else {
                throw new SVGParseException("Invalid value for attribute maskUnits");
            }
        }
    }

    public static class Dialog {
        public int EZpvd;
        public String OLrzqt;
        public int KWHzl = 0;
        public SP copydefault = new SP();

        public boolean KWHzl(int i) {
            return i == 10 || i == 13;
        }

        public boolean copydefault(int i) {
            return i == 32 || i == 10 || i == 13 || i == 9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean isConnected() {
            return this.KWHzl == this.EZpvd;
        }

        public Dialog(String str) {
            this.EZpvd = 0;
            String strTrim = str.trim();
            this.OLrzqt = strTrim;
            this.EZpvd = strTrim.length();
        }

        public void zsXlph() {
            while (true) {
                int i = this.KWHzl;
                if (i >= this.EZpvd || !copydefault(this.OLrzqt.charAt(i))) {
                    return;
                } else {
                    this.KWHzl++;
                }
            }
        }

        public boolean AubY() {
            zsXlph();
            int i = this.KWHzl;
            if (i == this.EZpvd || this.OLrzqt.charAt(i) != ',') {
                return false;
            }
            this.KWHzl++;
            zsXlph();
            return true;
        }

        public float fIwbmz() {
            float fOLrzqt = this.copydefault.OLrzqt(this.OLrzqt, this.KWHzl, this.EZpvd);
            if (!Float.isNaN(fOLrzqt)) {
                this.KWHzl = this.copydefault.KWHzl();
            }
            return fOLrzqt;
        }

        public float getNewProxyInstance() {
            AubY();
            float fOLrzqt = this.copydefault.OLrzqt(this.OLrzqt, this.KWHzl, this.EZpvd);
            if (!Float.isNaN(fOLrzqt)) {
                this.KWHzl = this.copydefault.KWHzl();
            }
            return fOLrzqt;
        }

        public float EZpvd(float f) {
            if (Float.isNaN(f)) {
                return Float.NaN;
            }
            AubY();
            return fIwbmz();
        }

        public float AEQbTJ(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            AubY();
            return fIwbmz();
        }

        public Integer ejfBZ() {
            int i = this.KWHzl;
            if (i == this.EZpvd) {
                return null;
            }
            String str = this.OLrzqt;
            this.KWHzl = i + 1;
            return Integer.valueOf(str.charAt(i));
        }

        public SVG.PictureInPictureParams fJNWhG() {
            float fFIwbmz = fIwbmz();
            if (Float.isNaN(fFIwbmz)) {
                return null;
            }
            SVG.Unit fieldNames = getFieldNames();
            if (fieldNames == null) {
                return new SVG.PictureInPictureParams(fFIwbmz, SVG.Unit.px);
            }
            return new SVG.PictureInPictureParams(fFIwbmz, fieldNames);
        }

        public Boolean fARcdN() {
            int i = this.KWHzl;
            if (i == this.EZpvd) {
                return null;
            }
            char cCharAt = this.OLrzqt.charAt(i);
            if (cCharAt != '0' && cCharAt != '1') {
                return null;
            }
            this.KWHzl++;
            return Boolean.valueOf(cCharAt == '1');
        }

        public Boolean EZpvd(Object obj) {
            if (obj == null) {
                return null;
            }
            AubY();
            return fARcdN();
        }

        public boolean KWHzl(char c) {
            int i = this.KWHzl;
            boolean z = i < this.EZpvd && this.OLrzqt.charAt(i) == c;
            if (z) {
                this.KWHzl++;
            }
            return z;
        }

        public boolean copydefault(String str) {
            int length = str.length();
            int i = this.KWHzl;
            boolean z = i <= this.EZpvd - length && this.OLrzqt.substring(i, i + length).equals(str);
            if (z) {
                this.KWHzl += length;
            }
            return z;
        }

        public int fetchVPNInfo() {
            int i = this.KWHzl;
            int i2 = this.EZpvd;
            if (i == i2) {
                return -1;
            }
            int i3 = i + 1;
            this.KWHzl = i3;
            if (i3 < i2) {
                return this.OLrzqt.charAt(i3);
            }
            return -1;
        }

        public String uzCIH() {
            return copydefault(' ', false);
        }

        public String AEQbTJ(char c) {
            return copydefault(c, false);
        }

        public String EZpvd(char c) {
            return copydefault(c, true);
        }

        public String copydefault(char c, boolean z) {
            if (isConnected()) {
                return null;
            }
            char cCharAt = this.OLrzqt.charAt(this.KWHzl);
            if ((!z && copydefault(cCharAt)) || cCharAt == c) {
                return null;
            }
            int i = this.KWHzl;
            int iFetchVPNInfo = fetchVPNInfo();
            while (iFetchVPNInfo != -1 && iFetchVPNInfo != c && (z || !copydefault(iFetchVPNInfo))) {
                iFetchVPNInfo = fetchVPNInfo();
            }
            return this.OLrzqt.substring(i, this.KWHzl);
        }

        public String hDKMBd() {
            if (isConnected()) {
                return null;
            }
            int i = this.KWHzl;
            char cCharAt = this.OLrzqt.charAt(i);
            if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                this.KWHzl = i;
                return null;
            }
            int iFetchVPNInfo = fetchVPNInfo();
            while (true) {
                if ((iFetchVPNInfo < 65 || iFetchVPNInfo > 90) && (iFetchVPNInfo < 97 || iFetchVPNInfo > 122)) {
                    break;
                }
                iFetchVPNInfo = fetchVPNInfo();
            }
            return this.OLrzqt.substring(i, this.KWHzl);
        }

        public String AuCTel() {
            if (isConnected()) {
                return null;
            }
            int i = this.KWHzl;
            int iCharAt = this.OLrzqt.charAt(i);
            while (true) {
                if ((iCharAt < 97 || iCharAt > 122) && (iCharAt < 65 || iCharAt > 90)) {
                    break;
                }
                iCharAt = fetchVPNInfo();
            }
            int i2 = this.KWHzl;
            while (copydefault(iCharAt)) {
                iCharAt = fetchVPNInfo();
            }
            if (iCharAt == 40) {
                this.KWHzl++;
                return this.OLrzqt.substring(i, i2);
            }
            this.KWHzl = i;
            return null;
        }

        public String values() {
            int i = this.KWHzl;
            while (!isConnected() && !copydefault(this.OLrzqt.charAt(this.KWHzl))) {
                this.KWHzl++;
            }
            String strSubstring = this.OLrzqt.substring(i, this.KWHzl);
            this.KWHzl = i;
            return strSubstring;
        }

        public SVG.Unit getFieldNames() {
            if (isConnected()) {
                return null;
            }
            if (this.OLrzqt.charAt(this.KWHzl) == '%') {
                this.KWHzl++;
                return SVG.Unit.percent;
            }
            int i = this.KWHzl;
            if (i > this.EZpvd - 2) {
                return null;
            }
            try {
                SVG.Unit unitValueOf = SVG.Unit.valueOf(this.OLrzqt.substring(i, i + 2).toLowerCase(Locale.US));
                this.KWHzl += 2;
                return unitValueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public boolean AkhnZx() {
            int i = this.KWHzl;
            if (i == this.EZpvd) {
                return false;
            }
            char cCharAt = this.OLrzqt.charAt(i);
            return (cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z');
        }

        public String iwGUEr() {
            if (isConnected()) {
                return null;
            }
            int i = this.KWHzl;
            char cCharAt = this.OLrzqt.charAt(i);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            int iFetchVPNInfo = fetchVPNInfo();
            while (iFetchVPNInfo != -1 && iFetchVPNInfo != cCharAt) {
                iFetchVPNInfo = fetchVPNInfo();
            }
            if (iFetchVPNInfo == -1) {
                this.KWHzl = i;
                return null;
            }
            int i2 = this.KWHzl;
            this.KWHzl = i2 + 1;
            return this.OLrzqt.substring(i + 1, i2);
        }

        public String AuCTelauCTel() {
            if (isConnected()) {
                return null;
            }
            int i = this.KWHzl;
            this.KWHzl = this.EZpvd;
            return this.OLrzqt.substring(i);
        }
    }

    public final void EZpvd(SVG.AssetManager assetManager, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                assetManager.fJNWhG = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i).trim();
                if ("default".equals(strTrim)) {
                    assetManager.fARcdN = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(strTrim)) {
                        assetManager.fARcdN = Boolean.TRUE;
                        return;
                    }
                    throw new SVGParseException("Invalid value for \"xml:space\" attribute: " + strTrim);
                }
            }
        }
    }

    public final void OLrzqt(SVG.AssetManager assetManager, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (strTrim.length() != 0) {
                int i2 = AnonymousClass4.copydefault[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
                if (i2 == 45) {
                    AEQbTJ(assetManager, strTrim);
                } else if (i2 == 46) {
                    assetManager.fIwbmz = CSSParser.OLrzqt(strTrim);
                } else {
                    if (assetManager.AuCTel == null) {
                        assetManager.AuCTel = new SVG.Style();
                    }
                    EZpvd(assetManager.AuCTel, attributes.getLocalName(i), attributes.getValue(i).trim());
                }
            }
        }
    }

    public static void AEQbTJ(SVG.AssetManager assetManager, String str) {
        Dialog dialog = new Dialog(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String strAEQbTJ = dialog.AEQbTJ(AbstractJsonLexerKt.COLON);
            dialog.zsXlph();
            if (!dialog.KWHzl(AbstractJsonLexerKt.COLON)) {
                return;
            }
            dialog.zsXlph();
            String strEZpvd = dialog.EZpvd(';');
            if (strEZpvd == null) {
                return;
            }
            dialog.zsXlph();
            if (dialog.isConnected() || dialog.KWHzl(';')) {
                if (assetManager.uzCIH == null) {
                    assetManager.uzCIH = new SVG.Style();
                }
                EZpvd(assetManager.uzCIH, strAEQbTJ, strEZpvd);
                dialog.zsXlph();
            }
        }
    }

    public static void EZpvd(SVG.Style style, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (AnonymousClass4.copydefault[SVGAttr.fromString(str).ordinal()]) {
                case 47:
                    SVG.TypedArray typedArrayDbNXlk = DbNXlk(str2);
                    style.djBIcL = typedArrayDbNXlk;
                    if (typedArrayDbNXlk != null) {
                        style.getNewProxyInstance |= 1;
                        return;
                    }
                    return;
                case 48:
                    SVG.Style.FillRule fillRuleCopydefault = copydefault(str2);
                    style.AYXKKw = fillRuleCopydefault;
                    if (fillRuleCopydefault != null) {
                        style.getNewProxyInstance |= 2;
                        return;
                    }
                    return;
                case 49:
                    Float fValues = values(str2);
                    style.gEmmrt = fValues;
                    if (fValues != null) {
                        style.getNewProxyInstance |= 4;
                        return;
                    }
                    return;
                case 50:
                    SVG.TypedArray typedArrayDbNXlk2 = DbNXlk(str2);
                    style.AuCTelauCTel = typedArrayDbNXlk2;
                    if (typedArrayDbNXlk2 != null) {
                        style.getNewProxyInstance |= 8;
                        return;
                    }
                    return;
                case 51:
                    Float fValues2 = values(str2);
                    style.AwvSrB = fValues2;
                    if (fValues2 != null) {
                        style.getNewProxyInstance |= 16;
                        return;
                    }
                    return;
                case 52:
                    style.zuBGHE = AkhnZx(str2);
                    style.getNewProxyInstance |= 32;
                    break;
                case 53:
                    SVG.Style.LineCap lineCapIwGUEr = iwGUEr(str2);
                    style.zLjUOn = lineCapIwGUEr;
                    if (lineCapIwGUEr != null) {
                        style.getNewProxyInstance |= 64;
                        return;
                    }
                    return;
                case 54:
                    SVG.Style.LineJoin lineJoinHDKMBd = hDKMBd(str2);
                    style.AubY = lineJoinHDKMBd;
                    if (lineJoinHDKMBd != null) {
                        style.getNewProxyInstance |= 128;
                        return;
                    }
                    return;
                case 55:
                    style.sSMYrx = Float.valueOf(valueOf(str2));
                    style.getNewProxyInstance |= 256;
                    break;
                case 56:
                    if ("none".equals(str2)) {
                        style.zsXlph = null;
                        style.getNewProxyInstance |= 512;
                        return;
                    }
                    SVG.PictureInPictureParams[] pictureInPictureParamsArrUzCIH = uzCIH(str2);
                    style.zsXlph = pictureInPictureParamsArrUzCIH;
                    if (pictureInPictureParamsArrUzCIH != null) {
                        style.getNewProxyInstance |= 512;
                        return;
                    }
                    return;
                case 57:
                    style.wlaJM = AkhnZx(str2);
                    style.getNewProxyInstance |= 1024;
                    break;
                case 58:
                    style.fJNWhG = values(str2);
                    style.getNewProxyInstance |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
                    return;
                case 59:
                    style.OLrzqt = OLrzqt(str2);
                    style.getNewProxyInstance |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                    break;
                case 60:
                    EZpvd(style, str2);
                    return;
                case 61:
                    List<String> listGEmmrt = gEmmrt(str2);
                    style.AhwBna = listGEmmrt;
                    if (listGEmmrt != null) {
                        style.getNewProxyInstance |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                        return;
                    }
                    return;
                case 62:
                    SVG.PictureInPictureParams pictureInPictureParamsDjBIcL = djBIcL(str2);
                    style.DbNXlk = pictureInPictureParamsDjBIcL;
                    if (pictureInPictureParamsDjBIcL != null) {
                        style.getNewProxyInstance |= 16384;
                        return;
                    }
                    return;
                case 63:
                    Integer numAYXKKw = AYXKKw(str2);
                    style.isConnected = numAYXKKw;
                    if (numAYXKKw != null) {
                        style.getNewProxyInstance |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
                        return;
                    }
                    return;
                case 64:
                    SVG.Style.FontStyle fontStyleAhwBna = AhwBna(str2);
                    style.values = fontStyleAhwBna;
                    if (fontStyleAhwBna != null) {
                        style.getNewProxyInstance |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
                        return;
                    }
                    return;
                case 65:
                    SVG.Style.TextDecoration textDecorationZsXlph = zsXlph(str2);
                    style.gHZMYf = textDecorationZsXlph;
                    if (textDecorationZsXlph != null) {
                        style.getNewProxyInstance |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
                        return;
                    }
                    return;
                case 66:
                    SVG.Style.TextDirection textDirectionAubY = AubY(str2);
                    style.EZpvd = textDirectionAubY;
                    if (textDirectionAubY != null) {
                        style.getNewProxyInstance |= 68719476736L;
                        return;
                    }
                    return;
                case 67:
                    SVG.Style.TextAnchor fieldNames = getFieldNames(str2);
                    style.AxsJAY = fieldNames;
                    if (fieldNames != null) {
                        style.getNewProxyInstance |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                        return;
                    }
                    return;
                case 68:
                    Boolean boolFetchVPNInfo = fetchVPNInfo(str2);
                    style.ejfBZ = boolFetchVPNInfo;
                    if (boolFetchVPNInfo != null) {
                        style.getNewProxyInstance |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
                        return;
                    }
                    return;
                case 69:
                    String strKWHzl = KWHzl(str2, str);
                    style.fARcdN = strKWHzl;
                    style.AuCTel = strKWHzl;
                    style.fetchVPNInfo = strKWHzl;
                    style.getNewProxyInstance |= 14680064;
                    return;
                case 70:
                    style.fARcdN = KWHzl(str2, str);
                    style.getNewProxyInstance |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
                    return;
                case 71:
                    style.AuCTel = KWHzl(str2, str);
                    style.getNewProxyInstance |= 4194304;
                    return;
                case 72:
                    style.fetchVPNInfo = KWHzl(str2, str);
                    style.getNewProxyInstance |= 8388608;
                    return;
                case 73:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            style.valueOf = Boolean.valueOf(!str2.equals("none"));
                            style.getNewProxyInstance |= 16777216;
                            return;
                        }
                        return;
                    }
                    return;
                case 74:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            style.QKVWgx = Boolean.valueOf(str2.equals("visible"));
                            style.getNewProxyInstance |= 33554432;
                            return;
                        }
                        return;
                    }
                    return;
                case 75:
                    if (str2.equals("currentColor")) {
                        style.iwGUEr = SVG.PendingIntent.OLrzqt();
                    } else {
                        try {
                            style.iwGUEr = OLrzqt(str2);
                        } catch (SVGParseException e) {
                            e.getMessage();
                            return;
                        }
                        break;
                    }
                    style.getNewProxyInstance |= 67108864;
                    return;
                case 76:
                    style.uzCIH = values(str2);
                    style.getNewProxyInstance |= 134217728;
                    return;
                case 77:
                    SVG.ActionBar actionBarKWHzl = KWHzl(str2);
                    style.AEQbTJ = actionBarKWHzl;
                    if (actionBarKWHzl != null) {
                        style.getNewProxyInstance |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                        return;
                    }
                    return;
                case 78:
                    style.KWHzl = KWHzl(str2, str);
                    style.getNewProxyInstance |= 268435456;
                    return;
                case 79:
                    style.copydefault = copydefault(str2);
                    style.getNewProxyInstance |= 536870912;
                    return;
                case 80:
                    style.fIwbmz = KWHzl(str2, str);
                    style.getNewProxyInstance |= 1073741824;
                    return;
                case 81:
                    if (str2.equals("currentColor")) {
                        style.getFieldNames = SVG.PendingIntent.OLrzqt();
                    } else {
                        try {
                            style.getFieldNames = OLrzqt(str2);
                        } catch (SVGParseException e2) {
                            e2.getMessage();
                            return;
                        }
                        break;
                    }
                    style.getNewProxyInstance |= 2147483648L;
                    return;
                case 82:
                    style.hDKMBd = values(str2);
                    style.getNewProxyInstance |= 4294967296L;
                    return;
                case 83:
                    if (str2.equals("currentColor")) {
                        style.OcIXYQ = SVG.PendingIntent.OLrzqt();
                    } else {
                        try {
                            style.OcIXYQ = OLrzqt(str2);
                        } catch (SVGParseException e3) {
                            e3.getMessage();
                            return;
                        }
                        break;
                    }
                    style.getNewProxyInstance |= 8589934592L;
                    return;
                case 84:
                    style.QOLQEE = values(str2);
                    style.getNewProxyInstance |= 17179869184L;
                    return;
                case 85:
                    SVG.Style.VectorEffect vectorEffectAuCTelauCTel = AuCTelauCTel(str2);
                    style.DTwDnp = vectorEffectAuCTelauCTel;
                    if (vectorEffectAuCTelauCTel != null) {
                        style.getNewProxyInstance |= 34359738368L;
                        return;
                    }
                    return;
                case 86:
                    SVG.Style.RenderQuality renderQualityFARcdN = fARcdN(str2);
                    style.AkhnZx = renderQualityFARcdN;
                    if (renderQualityFARcdN != null) {
                        style.getNewProxyInstance |= 137438953472L;
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (SVGParseException unused) {
        }
    }

    public final void KWHzl(SVG.Canvas canvas, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = AnonymousClass4.copydefault[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 7) {
                copydefault(canvas, strTrim);
            } else if (i2 == 87) {
                canvas.getNewProxyInstance = wlaJM(strTrim);
            }
        }
    }

    public final void copydefault(SVG.SharedElementCallback sharedElementCallback, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.transform) {
                sharedElementCallback.KWHzl(zuBGHE(attributes.getValue(i)));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Matrix zuBGHE(String str) throws SVGParseException {
        byte b;
        Matrix matrix = new Matrix();
        Dialog dialog = new Dialog(str);
        dialog.zsXlph();
        while (!dialog.isConnected()) {
            String strAuCTel = dialog.AuCTel();
            if (strAuCTel == null) {
                throw new SVGParseException("Bad transform function encountered in transform list: " + str);
            }
            switch (strAuCTel.hashCode()) {
                case -1081239615:
                    b = !strAuCTel.equals("matrix") ? (byte) -1 : (byte) 0;
                    break;
                case -925180581:
                    if (strAuCTel.equals("rotate")) {
                        b = 1;
                        break;
                    }
                    break;
                case 109250890:
                    if (strAuCTel.equals("scale")) {
                        b = 2;
                        break;
                    }
                    break;
                case 109493390:
                    if (strAuCTel.equals("skewX")) {
                        b = 3;
                        break;
                    }
                    break;
                case 109493391:
                    if (strAuCTel.equals("skewY")) {
                        b = 4;
                        break;
                    }
                    break;
                case 1052832078:
                    if (strAuCTel.equals("translate")) {
                        b = 5;
                        break;
                    }
                    break;
            }
            if (b == 0) {
                dialog.zsXlph();
                float fFIwbmz = dialog.fIwbmz();
                dialog.AubY();
                float fFIwbmz2 = dialog.fIwbmz();
                dialog.AubY();
                float fFIwbmz3 = dialog.fIwbmz();
                dialog.AubY();
                float fFIwbmz4 = dialog.fIwbmz();
                dialog.AubY();
                float fFIwbmz5 = dialog.fIwbmz();
                dialog.AubY();
                float fFIwbmz6 = dialog.fIwbmz();
                dialog.zsXlph();
                if (Float.isNaN(fFIwbmz6) || !dialog.KWHzl(')')) {
                    throw new SVGParseException("Invalid transform list: " + str);
                }
                Matrix matrix2 = new Matrix();
                matrix2.setValues(new float[]{fFIwbmz, fFIwbmz3, fFIwbmz5, fFIwbmz2, fFIwbmz4, fFIwbmz6, 0.0f, 0.0f, 1.0f});
                matrix.preConcat(matrix2);
            } else if (b == 1) {
                dialog.zsXlph();
                float fFIwbmz7 = dialog.fIwbmz();
                float newProxyInstance = dialog.getNewProxyInstance();
                float newProxyInstance2 = dialog.getNewProxyInstance();
                dialog.zsXlph();
                if (Float.isNaN(fFIwbmz7) || !dialog.KWHzl(')')) {
                    throw new SVGParseException("Invalid transform list: " + str);
                }
                if (Float.isNaN(newProxyInstance)) {
                    matrix.preRotate(fFIwbmz7);
                } else {
                    if (Float.isNaN(newProxyInstance2)) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    matrix.preRotate(fFIwbmz7, newProxyInstance, newProxyInstance2);
                }
            } else if (b == 2) {
                dialog.zsXlph();
                float fFIwbmz8 = dialog.fIwbmz();
                float newProxyInstance3 = dialog.getNewProxyInstance();
                dialog.zsXlph();
                if (Float.isNaN(fFIwbmz8) || !dialog.KWHzl(')')) {
                    throw new SVGParseException("Invalid transform list: " + str);
                }
                if (Float.isNaN(newProxyInstance3)) {
                    matrix.preScale(fFIwbmz8, fFIwbmz8);
                } else {
                    matrix.preScale(fFIwbmz8, newProxyInstance3);
                }
            } else if (b == 3) {
                dialog.zsXlph();
                float fFIwbmz9 = dialog.fIwbmz();
                dialog.zsXlph();
                if (Float.isNaN(fFIwbmz9) || !dialog.KWHzl(')')) {
                    throw new SVGParseException("Invalid transform list: " + str);
                }
                matrix.preSkew((float) Math.tan(Math.toRadians(fFIwbmz9)), 0.0f);
            } else if (b == 4) {
                dialog.zsXlph();
                float fFIwbmz10 = dialog.fIwbmz();
                dialog.zsXlph();
                if (Float.isNaN(fFIwbmz10) || !dialog.KWHzl(')')) {
                    throw new SVGParseException("Invalid transform list: " + str);
                }
                matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fFIwbmz10)));
            } else {
                if (b != 5) {
                    throw new SVGParseException("Invalid transform list fn: " + strAuCTel + ")");
                }
                dialog.zsXlph();
                float fFIwbmz11 = dialog.fIwbmz();
                float newProxyInstance4 = dialog.getNewProxyInstance();
                dialog.zsXlph();
                if (Float.isNaN(fFIwbmz11) || !dialog.KWHzl(')')) {
                    throw new SVGParseException("Invalid transform list: " + str);
                }
                if (Float.isNaN(newProxyInstance4)) {
                    matrix.preTranslate(fFIwbmz11, 0.0f);
                } else {
                    matrix.preTranslate(fFIwbmz11, newProxyInstance4);
                }
            }
            if (dialog.isConnected()) {
                return matrix;
            }
            dialog.AubY();
        }
        return matrix;
    }

    public static SVG.PictureInPictureParams AkhnZx(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length value (empty string)");
        }
        int length = str.length();
        SVG.Unit unitValueOf = SVG.Unit.px;
        int i = length - 1;
        char cCharAt = str.charAt(i);
        try {
            if (cCharAt == '%') {
                unitValueOf = SVG.Unit.percent;
            } else {
                if (length > 2 && Character.isLetter(cCharAt)) {
                    i = length - 2;
                    if (Character.isLetter(str.charAt(i))) {
                        try {
                            unitValueOf = SVG.Unit.valueOf(str.substring(i).toLowerCase(Locale.US));
                        } catch (IllegalArgumentException unused) {
                            throw new SVGParseException("Invalid length unit specifier: " + str);
                        }
                    }
                }
                return new SVG.PictureInPictureParams(KWHzl(str, 0, length), unitValueOf);
            }
            return new SVG.PictureInPictureParams(KWHzl(str, 0, length), unitValueOf);
        } catch (NumberFormatException e) {
            throw new SVGParseException("Invalid length value: " + str, e);
        }
        length = i;
    }

    public static List<SVG.PictureInPictureParams> isConnected(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        Dialog dialog = new Dialog(str);
        dialog.zsXlph();
        while (!dialog.isConnected()) {
            float fFIwbmz = dialog.fIwbmz();
            if (Float.isNaN(fFIwbmz)) {
                throw new SVGParseException("Invalid length list value: " + dialog.values());
            }
            SVG.Unit fieldNames = dialog.getFieldNames();
            if (fieldNames == null) {
                fieldNames = SVG.Unit.px;
            }
            arrayList.add(new SVG.PictureInPictureParams(fFIwbmz, fieldNames));
            dialog.AubY();
        }
        return arrayList;
    }

    public static float valueOf(String str) throws SVGParseException {
        int length = str.length();
        if (length == 0) {
            throw new SVGParseException("Invalid float value (empty string)");
        }
        return KWHzl(str, 0, length);
    }

    public static float KWHzl(String str, int i, int i2) throws SVGParseException {
        float fOLrzqt = new SP().OLrzqt(str, i, i2);
        if (!Float.isNaN(fOLrzqt)) {
            return fOLrzqt;
        }
        throw new SVGParseException("Invalid float value: " + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0009 A[PHI: r0
  0x0009: PHI (r0v2 float) = (r0v0 float), (r0v1 float) binds: [B:4:0x0007, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Float values(String str) {
        try {
            float fValueOf = valueOf(str);
            float f = 0.0f;
            if (fValueOf < 0.0f) {
                fValueOf = f;
            } else {
                f = 1.0f;
                if (fValueOf > 1.0f) {
                }
            }
            return Float.valueOf(fValueOf);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    public static SVG.Activity wlaJM(String str) throws SVGParseException {
        Dialog dialog = new Dialog(str);
        dialog.zsXlph();
        float fFIwbmz = dialog.fIwbmz();
        dialog.AubY();
        float fFIwbmz2 = dialog.fIwbmz();
        dialog.AubY();
        float fFIwbmz3 = dialog.fIwbmz();
        dialog.AubY();
        float fFIwbmz4 = dialog.fIwbmz();
        if (Float.isNaN(fFIwbmz) || Float.isNaN(fFIwbmz2) || Float.isNaN(fFIwbmz3) || Float.isNaN(fFIwbmz4)) {
            throw new SVGParseException("Invalid viewBox definition - should have four numbers");
        }
        if (fFIwbmz3 < 0.0f) {
            throw new SVGParseException("Invalid viewBox. width cannot be negative");
        }
        if (fFIwbmz4 < 0.0f) {
            throw new SVGParseException("Invalid viewBox. height cannot be negative");
        }
        return new SVG.Activity(fFIwbmz, fFIwbmz2, fFIwbmz3, fFIwbmz4);
    }

    public static void copydefault(SVG.Cursor cursor, String str) throws SVGParseException {
        cursor.hDKMBd = fJNWhG(str);
    }

    public static PreserveAspectRatio fJNWhG(String str) throws SVGParseException {
        PreserveAspectRatio.Scale scale;
        Dialog dialog = new Dialog(str);
        dialog.zsXlph();
        String strUzCIH = dialog.uzCIH();
        if ("defer".equals(strUzCIH)) {
            dialog.zsXlph();
            strUzCIH = dialog.uzCIH();
        }
        PreserveAspectRatio.Alignment alignmentOLrzqt = StateListAnimator.OLrzqt(strUzCIH);
        dialog.zsXlph();
        if (dialog.isConnected()) {
            scale = null;
        } else {
            String strUzCIH2 = dialog.uzCIH();
            strUzCIH2.hashCode();
            if (strUzCIH2.equals("meet")) {
                scale = PreserveAspectRatio.Scale.meet;
            } else if (strUzCIH2.equals("slice")) {
                scale = PreserveAspectRatio.Scale.slice;
            } else {
                throw new SVGParseException("Invalid preserveAspectRatio definition: " + str);
            }
        }
        return new PreserveAspectRatio(alignmentOLrzqt, scale);
    }

    public static SVG.TypedArray DbNXlk(String str) {
        if (str.startsWith("url(")) {
            int iIndexOf = str.indexOf(")");
            if (iIndexOf != -1) {
                String strTrim = str.substring(4, iIndexOf).trim();
                String strTrim2 = str.substring(iIndexOf + 1).trim();
                return new SVG.ComponentCallbacks2(strTrim, strTrim2.length() > 0 ? EZpvd(strTrim2) : null);
            }
            return new SVG.ComponentCallbacks2(str.substring(4).trim(), null);
        }
        return EZpvd(str);
    }

    public static SVG.TypedArray EZpvd(String str) {
        str.hashCode();
        if (str.equals("none")) {
            return SVG.TaskDescription.KWHzl;
        }
        if (str.equals("currentColor")) {
            return SVG.PendingIntent.OLrzqt();
        }
        try {
            return OLrzqt(str);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    public static SVG.TaskDescription OLrzqt(String str) throws SVGParseException {
        if (str.charAt(0) == '#') {
            SK skKWHzl = SK.KWHzl(str, 1, str.length());
            if (skKWHzl == null) {
                throw new SVGParseException("Bad hex colour value: " + str);
            }
            int iEZpvd = skKWHzl.EZpvd();
            if (iEZpvd == 4) {
                int iCopydefault = skKWHzl.copydefault();
                int i = iCopydefault & 3840;
                int i2 = iCopydefault & PsExtractor.VIDEO_STREAM_MASK;
                int i3 = iCopydefault & 15;
                return new SVG.TaskDescription(i3 | (i << 12) | ViewCompat.MEASURED_STATE_MASK | (i << 8) | (i2 << 8) | (i2 << 4) | (i3 << 4));
            }
            if (iEZpvd == 5) {
                int iCopydefault2 = skKWHzl.copydefault();
                int i4 = 61440 & iCopydefault2;
                int i5 = iCopydefault2 & 3840;
                int i6 = iCopydefault2 & PsExtractor.VIDEO_STREAM_MASK;
                int i7 = iCopydefault2 & 15;
                return new SVG.TaskDescription((i7 << 28) | (i7 << 24) | (i4 << 8) | (i4 << 4) | (i5 << 4) | i5 | i6 | (i6 >> 4));
            }
            if (iEZpvd == 7) {
                return new SVG.TaskDescription(skKWHzl.copydefault() | ViewCompat.MEASURED_STATE_MASK);
            }
            if (iEZpvd == 9) {
                return new SVG.TaskDescription((skKWHzl.copydefault() << 24) | (skKWHzl.copydefault() >>> 8));
            }
            throw new SVGParseException("Bad hex colour value: " + str);
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (zStartsWith || lowerCase.startsWith("rgb(")) {
            Dialog dialog = new Dialog(str.substring(zStartsWith ? 5 : 4));
            dialog.zsXlph();
            float fFIwbmz = dialog.fIwbmz();
            if (!Float.isNaN(fFIwbmz) && dialog.KWHzl('%')) {
                fFIwbmz = (fFIwbmz * 256.0f) / 100.0f;
            }
            float fEZpvd = dialog.EZpvd(fFIwbmz);
            if (!Float.isNaN(fEZpvd) && dialog.KWHzl('%')) {
                fEZpvd = (fEZpvd * 256.0f) / 100.0f;
            }
            float fEZpvd2 = dialog.EZpvd(fEZpvd);
            if (!Float.isNaN(fEZpvd2) && dialog.KWHzl('%')) {
                fEZpvd2 = (fEZpvd2 * 256.0f) / 100.0f;
            }
            if (zStartsWith) {
                float fEZpvd3 = dialog.EZpvd(fEZpvd2);
                dialog.zsXlph();
                if (Float.isNaN(fEZpvd3) || !dialog.KWHzl(')')) {
                    throw new SVGParseException("Bad rgba() colour value: " + str);
                }
                return new SVG.TaskDescription((EZpvd(fEZpvd3 * 256.0f) << 24) | (EZpvd(fFIwbmz) << 16) | (EZpvd(fEZpvd) << 8) | EZpvd(fEZpvd2));
            }
            dialog.zsXlph();
            if (Float.isNaN(fEZpvd2) || !dialog.KWHzl(')')) {
                throw new SVGParseException("Bad rgb() colour value: " + str);
            }
            return new SVG.TaskDescription((EZpvd(fFIwbmz) << 16) | ViewCompat.MEASURED_STATE_MASK | (EZpvd(fEZpvd) << 8) | EZpvd(fEZpvd2));
        }
        boolean zStartsWith2 = lowerCase.startsWith("hsla(");
        if (zStartsWith2 || lowerCase.startsWith("hsl(")) {
            Dialog dialog2 = new Dialog(str.substring(zStartsWith2 ? 5 : 4));
            dialog2.zsXlph();
            float fFIwbmz2 = dialog2.fIwbmz();
            float fEZpvd4 = dialog2.EZpvd(fFIwbmz2);
            if (!Float.isNaN(fEZpvd4)) {
                dialog2.KWHzl('%');
            }
            float fEZpvd5 = dialog2.EZpvd(fEZpvd4);
            if (!Float.isNaN(fEZpvd5)) {
                dialog2.KWHzl('%');
            }
            if (zStartsWith2) {
                float fEZpvd6 = dialog2.EZpvd(fEZpvd5);
                dialog2.zsXlph();
                if (Float.isNaN(fEZpvd6) || !dialog2.KWHzl(')')) {
                    throw new SVGParseException("Bad hsla() colour value: " + str);
                }
                return new SVG.TaskDescription((EZpvd(fEZpvd6 * 256.0f) << 24) | AEQbTJ(fFIwbmz2, fEZpvd4, fEZpvd5));
            }
            dialog2.zsXlph();
            if (Float.isNaN(fEZpvd5) || !dialog2.KWHzl(')')) {
                throw new SVGParseException("Bad hsl() colour value: " + str);
            }
            return new SVG.TaskDescription(AEQbTJ(fFIwbmz2, fEZpvd4, fEZpvd5) | ViewCompat.MEASURED_STATE_MASK);
        }
        return AEQbTJ(lowerCase);
    }

    public static int EZpvd(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    public static int AEQbTJ(float f, float f2, float f3) {
        float f4 = f % 360.0f;
        if (f < 0.0f) {
            f4 += 360.0f;
        }
        float f5 = f4 / 60.0f;
        float f6 = f2 / 100.0f;
        float f7 = f3 / 100.0f;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        } else if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        float f8 = f7 >= 0.0f ? f7 > 1.0f ? 1.0f : f7 : 0.0f;
        float f9 = f8 <= 0.5f ? (f6 + 1.0f) * f8 : (f8 + f6) - (f6 * f8);
        float f10 = (f8 * 2.0f) - f9;
        return EZpvd(EZpvd(f10, f9, f5 - 2.0f) * 256.0f) | (EZpvd(EZpvd(f10, f9, f5 + 2.0f) * 256.0f) << 16) | (EZpvd(EZpvd(f10, f9, f5) * 256.0f) << 8);
    }

    public static SVG.TaskDescription AEQbTJ(String str) throws SVGParseException {
        Integer numKWHzl = TaskDescription.KWHzl(str);
        if (numKWHzl == null) {
            throw new SVGParseException("Invalid colour keyword: " + str);
        }
        return new SVG.TaskDescription(numKWHzl.intValue());
    }

    public static void EZpvd(SVG.Style style, String str) {
        String strAEQbTJ;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            Dialog dialog = new Dialog(str);
            Integer numAEQbTJ = null;
            SVG.Style.FontStyle fontStyleAhwBna = null;
            String str2 = null;
            while (true) {
                strAEQbTJ = dialog.AEQbTJ(JsonPointer.SEPARATOR);
                dialog.zsXlph();
                if (strAEQbTJ != null) {
                    if (numAEQbTJ != null && fontStyleAhwBna != null) {
                        break;
                    }
                    if (!strAEQbTJ.equals("normal") && (numAEQbTJ != null || (numAEQbTJ = Activity.AEQbTJ(strAEQbTJ)) == null)) {
                        if (fontStyleAhwBna != null || (fontStyleAhwBna = AhwBna(strAEQbTJ)) == null) {
                            if (str2 != null || !strAEQbTJ.equals("small-caps")) {
                                break;
                            } else {
                                str2 = strAEQbTJ;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            SVG.PictureInPictureParams pictureInPictureParamsDjBIcL = djBIcL(strAEQbTJ);
            if (dialog.KWHzl(JsonPointer.SEPARATOR)) {
                dialog.zsXlph();
                String strUzCIH = dialog.uzCIH();
                if (strUzCIH != null) {
                    try {
                        AkhnZx(strUzCIH);
                    } catch (SVGParseException unused) {
                        return;
                    }
                }
                dialog.zsXlph();
            }
            style.AhwBna = gEmmrt(dialog.AuCTelauCTel());
            style.DbNXlk = pictureInPictureParamsDjBIcL;
            style.isConnected = Integer.valueOf(numAEQbTJ == null ? 400 : numAEQbTJ.intValue());
            if (fontStyleAhwBna == null) {
                fontStyleAhwBna = SVG.Style.FontStyle.Normal;
            }
            style.values = fontStyleAhwBna;
            style.getNewProxyInstance |= 122880;
        }
    }

    public static List<String> gEmmrt(String str) {
        Dialog dialog = new Dialog(str);
        ArrayList arrayList = null;
        do {
            String strIwGUEr = dialog.iwGUEr();
            if (strIwGUEr == null) {
                strIwGUEr = dialog.EZpvd(AbstractJsonLexerKt.COMMA);
            }
            if (strIwGUEr == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strIwGUEr);
            dialog.AubY();
        } while (!dialog.isConnected());
        return arrayList;
    }

    public static SVG.PictureInPictureParams djBIcL(String str) {
        try {
            SVG.PictureInPictureParams pictureInPictureParamsKWHzl = ActionBar.KWHzl(str);
            return pictureInPictureParamsKWHzl == null ? AkhnZx(str) : pictureInPictureParamsKWHzl;
        } catch (SVGParseException unused) {
            return null;
        }
    }

    public static Integer AYXKKw(String str) {
        return Activity.AEQbTJ(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SVG.Style.FontStyle AhwBna(String str) {
        byte b;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -1657669071) {
            if (iHashCode != -1178781136) {
                b = (iHashCode == -1039745817 && str.equals("normal")) ? (byte) 2 : (byte) -1;
            } else if (str.equals("italic")) {
                b = 1;
            }
        } else if (str.equals("oblique")) {
            b = 0;
        }
        if (b == 0) {
            return SVG.Style.FontStyle.Oblique;
        }
        if (b == 1) {
            return SVG.Style.FontStyle.Italic;
        }
        if (b != 2) {
            return null;
        }
        return SVG.Style.FontStyle.Normal;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SVG.Style.TextDecoration zsXlph(String str) {
        byte b;
        str.hashCode();
        switch (str.hashCode()) {
            case -1171789332:
                b = !str.equals("line-through") ? (byte) -1 : (byte) 0;
                break;
            case -1026963764:
                if (str.equals(TtmlNode.UNDERLINE)) {
                    b = 1;
                    break;
                }
                break;
            case 3387192:
                if (str.equals("none")) {
                    b = 2;
                    break;
                }
                break;
            case 93826908:
                if (str.equals("blink")) {
                    b = 3;
                    break;
                }
                break;
            case 529818312:
                if (str.equals("overline")) {
                    b = 4;
                    break;
                }
                break;
        }
        if (b == 0) {
            return SVG.Style.TextDecoration.LineThrough;
        }
        if (b == 1) {
            return SVG.Style.TextDecoration.Underline;
        }
        if (b == 2) {
            return SVG.Style.TextDecoration.None;
        }
        if (b == 3) {
            return SVG.Style.TextDecoration.Blink;
        }
        if (b != 4) {
            return null;
        }
        return SVG.Style.TextDecoration.Overline;
    }

    public static SVG.Style.TextDirection AubY(String str) {
        str.hashCode();
        if (str.equals("ltr")) {
            return SVG.Style.TextDirection.LTR;
        }
        if (str.equals("rtl")) {
            return SVG.Style.TextDirection.RTL;
        }
        return null;
    }

    public static SVG.Style.FillRule copydefault(String str) {
        if ("nonzero".equals(str)) {
            return SVG.Style.FillRule.NonZero;
        }
        if ("evenodd".equals(str)) {
            return SVG.Style.FillRule.EvenOdd;
        }
        return null;
    }

    public static SVG.Style.LineCap iwGUEr(String str) {
        if ("butt".equals(str)) {
            return SVG.Style.LineCap.Butt;
        }
        if ("round".equals(str)) {
            return SVG.Style.LineCap.Round;
        }
        if ("square".equals(str)) {
            return SVG.Style.LineCap.Square;
        }
        return null;
    }

    public static SVG.Style.LineJoin hDKMBd(String str) {
        if ("miter".equals(str)) {
            return SVG.Style.LineJoin.Miter;
        }
        if ("round".equals(str)) {
            return SVG.Style.LineJoin.Round;
        }
        if ("bevel".equals(str)) {
            return SVG.Style.LineJoin.Bevel;
        }
        return null;
    }

    public static SVG.PictureInPictureParams[] uzCIH(String str) {
        SVG.PictureInPictureParams pictureInPictureParamsFJNWhG;
        Dialog dialog = new Dialog(str);
        dialog.zsXlph();
        if (dialog.isConnected() || (pictureInPictureParamsFJNWhG = dialog.fJNWhG()) == null || pictureInPictureParamsFJNWhG.EZpvd()) {
            return null;
        }
        float fAEQbTJ = pictureInPictureParamsFJNWhG.AEQbTJ();
        ArrayList arrayList = new ArrayList();
        arrayList.add(pictureInPictureParamsFJNWhG);
        while (!dialog.isConnected()) {
            dialog.AubY();
            SVG.PictureInPictureParams pictureInPictureParamsFJNWhG2 = dialog.fJNWhG();
            if (pictureInPictureParamsFJNWhG2 == null || pictureInPictureParamsFJNWhG2.EZpvd()) {
                return null;
            }
            arrayList.add(pictureInPictureParamsFJNWhG2);
            fAEQbTJ += pictureInPictureParamsFJNWhG2.AEQbTJ();
        }
        if (fAEQbTJ == 0.0f) {
            return null;
        }
        return (SVG.PictureInPictureParams[]) arrayList.toArray(new SVG.PictureInPictureParams[arrayList.size()]);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SVG.Style.TextAnchor getFieldNames(String str) {
        byte b;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -1074341483) {
            if (iHashCode != 100571) {
                b = (iHashCode == 109757538 && str.equals(TtmlNode.START)) ? (byte) 2 : (byte) -1;
            } else if (str.equals(TtmlNode.END)) {
                b = 1;
            }
        } else if (str.equals("middle")) {
            b = 0;
        }
        if (b == 0) {
            return SVG.Style.TextAnchor.Middle;
        }
        if (b == 1) {
            return SVG.Style.TextAnchor.End;
        }
        if (b != 2) {
            return null;
        }
        return SVG.Style.TextAnchor.Start;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Boolean fetchVPNInfo(String str) {
        byte b;
        str.hashCode();
        switch (str.hashCode()) {
            case -1217487446:
                b = !str.equals("hidden") ? (byte) -1 : (byte) 0;
                break;
            case -907680051:
                if (str.equals("scroll")) {
                    b = 1;
                    break;
                }
                break;
            case 3005871:
                if (str.equals(DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                    b = 2;
                    break;
                }
                break;
            case 466743410:
                if (str.equals("visible")) {
                    b = 3;
                    break;
                }
                break;
        }
        if (b == 0 || b == 1) {
            return Boolean.FALSE;
        }
        if (b == 2 || b == 3) {
            return Boolean.TRUE;
        }
        return null;
    }

    public static SVG.ActionBar KWHzl(String str) {
        if (DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        Dialog dialog = new Dialog(str.substring(5));
        dialog.zsXlph();
        SVG.PictureInPictureParams pictureInPictureParamsOLrzqt = OLrzqt(dialog);
        dialog.AubY();
        SVG.PictureInPictureParams pictureInPictureParamsOLrzqt2 = OLrzqt(dialog);
        dialog.AubY();
        SVG.PictureInPictureParams pictureInPictureParamsOLrzqt3 = OLrzqt(dialog);
        dialog.AubY();
        SVG.PictureInPictureParams pictureInPictureParamsOLrzqt4 = OLrzqt(dialog);
        dialog.zsXlph();
        if (dialog.KWHzl(')') || dialog.isConnected()) {
            return new SVG.ActionBar(pictureInPictureParamsOLrzqt, pictureInPictureParamsOLrzqt2, pictureInPictureParamsOLrzqt3, pictureInPictureParamsOLrzqt4);
        }
        return null;
    }

    public static SVG.PictureInPictureParams OLrzqt(Dialog dialog) {
        if (dialog.copydefault(DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
            return new SVG.PictureInPictureParams(0.0f);
        }
        return dialog.fJNWhG();
    }

    public static SVG.Style.VectorEffect AuCTelauCTel(String str) {
        str.hashCode();
        if (str.equals("none")) {
            return SVG.Style.VectorEffect.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return SVG.Style.VectorEffect.NonScalingStroke;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SVG.Style.RenderQuality fARcdN(String str) {
        byte b;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -933002398) {
            if (iHashCode != 3005871) {
                b = (iHashCode == 362741610 && str.equals("optimizeSpeed")) ? (byte) 2 : (byte) -1;
            } else if (str.equals(DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                b = 1;
            }
        } else if (str.equals("optimizeQuality")) {
            b = 0;
        }
        if (b == 0) {
            return SVG.Style.RenderQuality.optimizeQuality;
        }
        if (b == 1) {
            return SVG.Style.RenderQuality.auto;
        }
        if (b != 2) {
            return null;
        }
        return SVG.Style.RenderQuality.optimizeSpeed;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SVG.Context ejfBZ(String str) {
        float f;
        float f2;
        float fEZpvd;
        Dialog dialog = new Dialog(str);
        SVG.Context context = new SVG.Context();
        if (dialog.isConnected()) {
            return context;
        }
        int iIntValue = dialog.ejfBZ().intValue();
        int i = 109;
        if (iIntValue != 77 && iIntValue != 109) {
            return context;
        }
        int iIntValue2 = iIntValue;
        float f3 = 0.0f;
        float fFIwbmz = 0.0f;
        float f4 = 0.0f;
        float fEZpvd2 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        while (true) {
            dialog.zsXlph();
            switch (iIntValue2) {
                case 65:
                case 97:
                    float fFIwbmz2 = dialog.fIwbmz();
                    float fEZpvd3 = dialog.EZpvd(fFIwbmz2);
                    float fEZpvd4 = dialog.EZpvd(fEZpvd3);
                    Boolean boolEZpvd = dialog.EZpvd(Float.valueOf(fEZpvd4));
                    Boolean boolEZpvd2 = dialog.EZpvd(boolEZpvd);
                    float fAEQbTJ = dialog.AEQbTJ(boolEZpvd2);
                    float fEZpvd5 = dialog.EZpvd(fAEQbTJ);
                    if (!Float.isNaN(fEZpvd5) && fFIwbmz2 >= 0.0f && fEZpvd3 >= 0.0f) {
                        if (iIntValue2 == 97) {
                            fAEQbTJ += f3;
                            fEZpvd5 += f4;
                        }
                        float f7 = fAEQbTJ;
                        context.copydefault(fFIwbmz2, fEZpvd3, fEZpvd4, boolEZpvd.booleanValue(), boolEZpvd2.booleanValue(), f7, fEZpvd5);
                        f3 = f7;
                        fFIwbmz = f3;
                        f4 = fEZpvd5;
                        fEZpvd2 = f4;
                        dialog.AubY();
                        if (dialog.isConnected()) {
                            if (dialog.AkhnZx()) {
                                iIntValue2 = dialog.ejfBZ().intValue();
                            }
                            i = 109;
                        }
                    }
                    break;
                case 67:
                case 99:
                    float fFIwbmz3 = dialog.fIwbmz();
                    float fEZpvd6 = dialog.EZpvd(fFIwbmz3);
                    float fEZpvd7 = dialog.EZpvd(fEZpvd6);
                    float fEZpvd8 = dialog.EZpvd(fEZpvd7);
                    float fEZpvd9 = dialog.EZpvd(fEZpvd8);
                    float fEZpvd10 = dialog.EZpvd(fEZpvd9);
                    if (Float.isNaN(fEZpvd10)) {
                        break;
                    } else {
                        if (iIntValue2 == 99) {
                            fEZpvd9 += f3;
                            fEZpvd10 += f4;
                            fFIwbmz3 += f3;
                            fEZpvd6 += f4;
                            fEZpvd7 += f3;
                            fEZpvd8 += f4;
                        }
                        float f8 = fEZpvd7;
                        float f9 = fEZpvd9;
                        float f10 = fEZpvd10;
                        float f11 = fEZpvd8;
                        context.AEQbTJ(fFIwbmz3, fEZpvd6, f8, f11, f9, f10);
                        fEZpvd2 = f11;
                        f = f8;
                        f4 = f10;
                        f2 = f9;
                        fFIwbmz = f;
                        f3 = f2;
                        dialog.AubY();
                        if (dialog.isConnected()) {
                        }
                    }
                    break;
                case 72:
                case 104:
                    fFIwbmz = dialog.fIwbmz();
                    if (Float.isNaN(fFIwbmz)) {
                        break;
                    } else {
                        if (iIntValue2 == 104) {
                            fFIwbmz += f3;
                        }
                        context.OLrzqt(fFIwbmz, f4);
                        f3 = fFIwbmz;
                        dialog.AubY();
                        if (dialog.isConnected()) {
                        }
                    }
                    break;
                case 76:
                case 108:
                    float fFIwbmz4 = dialog.fIwbmz();
                    fEZpvd = dialog.EZpvd(fFIwbmz4);
                    if (Float.isNaN(fEZpvd)) {
                        break;
                    } else {
                        if (iIntValue2 == 108) {
                            fFIwbmz4 += f3;
                            fEZpvd += f4;
                        }
                        f3 = fFIwbmz4;
                        context.OLrzqt(f3, fEZpvd);
                        fFIwbmz = f3;
                        f4 = fEZpvd;
                        fEZpvd2 = f4;
                        dialog.AubY();
                        if (dialog.isConnected()) {
                        }
                    }
                    break;
                case 77:
                case 109:
                    float fFIwbmz5 = dialog.fIwbmz();
                    float fEZpvd11 = dialog.EZpvd(fFIwbmz5);
                    if (Float.isNaN(fEZpvd11)) {
                        break;
                    } else {
                        if (iIntValue2 == i && !context.EZpvd()) {
                            fFIwbmz5 += f3;
                            fEZpvd11 += f4;
                        }
                        f5 = fFIwbmz5;
                        f4 = fEZpvd11;
                        context.KWHzl(f5, f4);
                        iIntValue2 = iIntValue2 == i ? 108 : 76;
                        fEZpvd2 = f4;
                        f6 = fEZpvd2;
                        f3 = f5;
                        fFIwbmz = f3;
                        dialog.AubY();
                        if (dialog.isConnected()) {
                        }
                    }
                    break;
                case 81:
                case WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST /* 113 */:
                    fFIwbmz = dialog.fIwbmz();
                    fEZpvd2 = dialog.EZpvd(fFIwbmz);
                    float fEZpvd12 = dialog.EZpvd(fEZpvd2);
                    float fEZpvd13 = dialog.EZpvd(fEZpvd12);
                    if (Float.isNaN(fEZpvd13)) {
                        break;
                    } else {
                        if (iIntValue2 == 113) {
                            fEZpvd12 += f3;
                            fEZpvd13 += f4;
                            fFIwbmz += f3;
                            fEZpvd2 += f4;
                        }
                        f4 = fEZpvd13;
                        context.EZpvd(fFIwbmz, fEZpvd2, fEZpvd12, f4);
                        f3 = fEZpvd12;
                        dialog.AubY();
                        if (dialog.isConnected()) {
                        }
                    }
                    break;
                case 83:
                case 115:
                    float fFIwbmz6 = dialog.fIwbmz();
                    float fEZpvd14 = dialog.EZpvd(fFIwbmz6);
                    float fEZpvd15 = dialog.EZpvd(fEZpvd14);
                    float fEZpvd16 = dialog.EZpvd(fEZpvd15);
                    if (Float.isNaN(fEZpvd16)) {
                        break;
                    } else {
                        if (iIntValue2 == 115) {
                            fEZpvd15 += f3;
                            fEZpvd16 += f4;
                            fFIwbmz6 += f3;
                            fEZpvd14 += f4;
                        }
                        float f12 = fEZpvd14;
                        float f13 = fEZpvd16;
                        f2 = fEZpvd15;
                        f = fFIwbmz6;
                        context.AEQbTJ((f3 * 2.0f) - fFIwbmz, (f4 * 2.0f) - fEZpvd2, f, f12, f2, f13);
                        fEZpvd2 = f12;
                        f4 = f13;
                        fFIwbmz = f;
                        f3 = f2;
                        dialog.AubY();
                        if (dialog.isConnected()) {
                        }
                    }
                    break;
                case 84:
                case AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID /* 116 */:
                    float f14 = (f3 * 2.0f) - fFIwbmz;
                    fEZpvd2 = (2.0f * f4) - fEZpvd2;
                    float fFIwbmz7 = dialog.fIwbmz();
                    float fEZpvd17 = dialog.EZpvd(fFIwbmz7);
                    if (Float.isNaN(fEZpvd17)) {
                        break;
                    } else {
                        if (iIntValue2 == 116) {
                            fFIwbmz7 += f3;
                            fEZpvd17 += f4;
                        }
                        f4 = fEZpvd17;
                        context.EZpvd(f14, fEZpvd2, fFIwbmz7, f4);
                        f3 = fFIwbmz7;
                        fFIwbmz = f14;
                        dialog.AubY();
                        if (dialog.isConnected()) {
                        }
                    }
                    break;
                case 86:
                case 118:
                    fEZpvd = dialog.fIwbmz();
                    if (Float.isNaN(fEZpvd)) {
                        break;
                    } else {
                        if (iIntValue2 == 118) {
                            fEZpvd += f4;
                        }
                        context.OLrzqt(f3, fEZpvd);
                        f4 = fEZpvd;
                        fEZpvd2 = f4;
                        dialog.AubY();
                        if (dialog.isConnected()) {
                        }
                    }
                    break;
                case 90:
                case 122:
                    context.AEQbTJ();
                    f3 = f5;
                    fFIwbmz = f3;
                    f4 = f6;
                    fEZpvd2 = f4;
                    dialog.AubY();
                    if (dialog.isConnected()) {
                    }
                    break;
            }
            return context;
        }
    }

    public static Set<String> AuCTel(String str) {
        Dialog dialog = new Dialog(str);
        HashSet hashSet = new HashSet();
        while (!dialog.isConnected()) {
            String strUzCIH = dialog.uzCIH();
            if (strUzCIH.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(strUzCIH.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            dialog.zsXlph();
        }
        return hashSet;
    }

    public static Set<String> getNewProxyInstance(String str) {
        Dialog dialog = new Dialog(str);
        HashSet hashSet = new HashSet();
        while (!dialog.isConnected()) {
            String strUzCIH = dialog.uzCIH();
            int iIndexOf = strUzCIH.indexOf(45);
            if (iIndexOf != -1) {
                strUzCIH = strUzCIH.substring(0, iIndexOf);
            }
            hashSet.add(new Locale(strUzCIH, "", "").getLanguage());
            dialog.zsXlph();
        }
        return hashSet;
    }

    public static Set<String> fIwbmz(String str) {
        Dialog dialog = new Dialog(str);
        HashSet hashSet = new HashSet();
        while (!dialog.isConnected()) {
            hashSet.add(dialog.uzCIH());
            dialog.zsXlph();
        }
        return hashSet;
    }

    public static String KWHzl(String str, String str2) {
        if (str.equals("none") || !str.startsWith("url(")) {
            return null;
        }
        if (str.endsWith(")")) {
            return str.substring(4, str.length() - 1).trim();
        }
        return str.substring(4).trim();
    }

    public final void fARcdN(Attributes attributes) throws SVGParseException {
        OLrzqt("<style>", new Object[0]);
        if (this.OLrzqt == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        String str = "all";
        boolean zEquals = true;
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = AnonymousClass4.copydefault[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 88) {
                zEquals = strTrim.equals("text/css");
            } else if (i2 == 89) {
                str = strTrim;
            }
        }
        if (zEquals && CSSParser.EZpvd(str, CSSParser.MediaType.screen)) {
            this.copydefault = true;
        } else {
            this.KWHzl = true;
            this.AEQbTJ = 1;
        }
    }

    public final void AwvSrB(String str) {
        this.djBIcL.AEQbTJ(new CSSParser(CSSParser.MediaType.screen, CSSParser.Source.Document).copydefault(str));
    }
}
