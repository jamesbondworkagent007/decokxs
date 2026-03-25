package org.htmlcleaner;

import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import o.C59894zpn;
import o.InterfaceC59892zpl;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes24.dex */
public class ConfigFileTagProvider extends HashMap implements InterfaceC59892zpl {
    static SAXParserFactory parserFactory;
    private boolean generateCode = false;

    static {
        SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
        parserFactory = sAXParserFactoryNewInstance;
        sAXParserFactoryNewInstance.setValidating(false);
        parserFactory.setNamespaceAware(false);
    }

    private ConfigFileTagProvider() {
    }

    public ConfigFileTagProvider(InputSource inputSource) {
        try {
            new ActionBar(this).KWHzl(inputSource);
        } catch (Exception e) {
            throw new HtmlCleanerException("Error parsing tag configuration file!", e);
        }
    }

    public ConfigFileTagProvider(File file) {
        try {
            new ActionBar(this).KWHzl(new InputSource(new FileReader(file)));
        } catch (Exception e) {
            throw new HtmlCleanerException("Error parsing tag configuration file!", e);
        }
    }

    public ConfigFileTagProvider(URL url) {
        try {
            Object content = url.getContent();
            if (content instanceof InputStream) {
                new ActionBar(this).KWHzl(new InputSource(new InputStreamReader((InputStream) content)));
            }
        } catch (Exception e) {
            throw new HtmlCleanerException("Error parsing tag configuration file!", e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC59892zpl
    public C59894zpn getTagInfo(String str) {
        return (C59894zpn) get(str);
    }

    public static void main(String[] strArr) throws ParserConfigurationException, SAXException, IOException {
        ConfigFileTagProvider configFileTagProvider = new ConfigFileTagProvider();
        configFileTagProvider.generateCode = true;
        File file = new File((strArr == null || strArr.length <= 0) ? "default.xml" : strArr[0]);
        ActionBar actionBar = configFileTagProvider.new ActionBar(configFileTagProvider);
        PrintStream printStream = System.out;
        printStream.println("package org.htmlcleaner;");
        printStream.println("import java.util.HashMap;");
        printStream.println("public class CustomTagProvider extends HashMap implements ITagInfoProvider {");
        printStream.println("private ConcurrentMap<String, TagInfo> tagInfoMap = new ConcurrentHashMap<String, TagInfo>();");
        printStream.println("// singleton instance, used if no other TagInfoProvider is specified");
        printStream.println("public final static CustomTagProvider INSTANCE= new CustomTagProvider();");
        StringBuilder sb = new StringBuilder();
        sb.append("public ");
        sb.append("CustomTagProvider");
        sb.append("() {");
        printStream.println(sb.toString());
        printStream.println("TagInfo tagInfo;");
        actionBar.KWHzl(new InputSource(new FileReader(file)));
        printStream.println("}");
        printStream.println("}");
    }

    public class ActionBar extends DefaultHandler {
        public Map KWHzl;
        public C59894zpn AEQbTJ = null;
        public String copydefault = null;

        public ActionBar(Map map) {
            this.KWHzl = map;
        }

        public void KWHzl(InputSource inputSource) throws ParserConfigurationException, SAXException, IOException {
            ConfigFileTagProvider.parserFactory.newSAXParser().parse(inputSource, this);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) throws SAXException {
            if (this.AEQbTJ != null) {
                String strTrim = new String(cArr, i, i2).trim();
                if ("fatal-tags".equals(this.copydefault)) {
                    this.AEQbTJ.OLrzqt(strTrim);
                    if (ConfigFileTagProvider.this.generateCode) {
                        System.out.println("tagInfo.defineFatalTags(\"" + strTrim + "\");");
                        return;
                    }
                    return;
                }
                if ("req-enclosing-tags".equals(this.copydefault)) {
                    this.AEQbTJ.AhwBna(strTrim);
                    if (ConfigFileTagProvider.this.generateCode) {
                        System.out.println("tagInfo.defineRequiredEnclosingTags(\"" + strTrim + "\");");
                        return;
                    }
                    return;
                }
                if ("forbidden-tags".equals(this.copydefault)) {
                    this.AEQbTJ.AYXKKw(strTrim);
                    if (ConfigFileTagProvider.this.generateCode) {
                        System.out.println("tagInfo.defineForbiddenTags(\"" + strTrim + "\");");
                        return;
                    }
                    return;
                }
                if ("allowed-children-tags".equals(this.copydefault)) {
                    this.AEQbTJ.EZpvd(strTrim);
                    if (ConfigFileTagProvider.this.generateCode) {
                        System.out.println("tagInfo.defineAllowedChildrenTags(\"" + strTrim + "\");");
                        return;
                    }
                    return;
                }
                if ("higher-level-tags".equals(this.copydefault)) {
                    this.AEQbTJ.valueOf(strTrim);
                    if (ConfigFileTagProvider.this.generateCode) {
                        System.out.println("tagInfo.defineHigherLevelTags(\"" + strTrim + "\");");
                        return;
                    }
                    return;
                }
                if ("close-before-copy-inside-tags".equals(this.copydefault)) {
                    this.AEQbTJ.AEQbTJ(strTrim);
                    if (ConfigFileTagProvider.this.generateCode) {
                        System.out.println("tagInfo.defineCloseBeforeCopyInsideTags(\"" + strTrim + "\");");
                        return;
                    }
                    return;
                }
                if ("close-inside-copy-after-tags".equals(this.copydefault)) {
                    this.AEQbTJ.copydefault(strTrim);
                    if (ConfigFileTagProvider.this.generateCode) {
                        System.out.println("tagInfo.defineCloseInsideCopyAfterTags(\"" + strTrim + "\");");
                        return;
                    }
                    return;
                }
                if ("close-before-tags".equals(this.copydefault)) {
                    this.AEQbTJ.KWHzl(strTrim);
                    if (ConfigFileTagProvider.this.generateCode) {
                        System.out.println("tagInfo.defineCloseBeforeTags(\"" + strTrim + "\");");
                    }
                }
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            if ("tag".equals(str3)) {
                String value = attributes.getValue("name");
                String value2 = attributes.getValue("content");
                String value3 = attributes.getValue("section");
                String value4 = attributes.getValue("deprecated");
                String value5 = attributes.getValue("unique");
                String value6 = attributes.getValue("ignore-permitted");
                ContentType value7 = ContentType.toValue(value2);
                BelongsTo value8 = BelongsTo.toValue(value3);
                this.AEQbTJ = new C59894zpn(value, value7, value8, value4 != null && "true".equals(value4), value5 != null && "true".equals(value5), value6 != null && "true".equals(value6), CloseTag.required, Display.any);
                if (ConfigFileTagProvider.this.generateCode) {
                    System.out.println("tagInfo = new TagInfo(\"#1\", #2, #3, #4, #5, #6);".replaceAll("#1", value).replaceAll("#2", ContentType.class.getCanonicalName() + JwtUtilsKt.JWT_DELIMITER + value7.name()).replaceAll("#3", BelongsTo.class.getCanonicalName() + JwtUtilsKt.JWT_DELIMITER + value8.name()).replaceAll("#4", Boolean.toString(value4 != null && "true".equals(value4))).replaceAll("#5", Boolean.toString(value5 != null && "true".equals(value5))).replaceAll("#6", Boolean.toString(value6 != null && "true".equals(value6))));
                    return;
                }
                return;
            }
            if ("tags".equals(str3)) {
                return;
            }
            this.copydefault = str3;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            if (!"tag".equals(str3)) {
                if ("tags".equals(str3)) {
                    return;
                }
                this.copydefault = null;
                return;
            }
            C59894zpn c59894zpn = this.AEQbTJ;
            if (c59894zpn != null) {
                this.KWHzl.put(c59894zpn.AEQbTJ(), this.AEQbTJ);
                if (ConfigFileTagProvider.this.generateCode) {
                    System.out.println("this.put(\"" + this.AEQbTJ.AEQbTJ() + "\", tagInfo);\n");
                }
            }
            this.AEQbTJ = null;
        }
    }
}
