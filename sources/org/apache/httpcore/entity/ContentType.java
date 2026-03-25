package org.apache.httpcore.entity;

import androidx.browser.trusted.sharing.ShareTarget;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import o.C59815zoE;
import o.C59818zoH;
import o.C59822zoL;
import o.C59825zoO;
import o.C59827zoQ;
import o.C59861zoy;
import o.InterfaceC59813zoC;
import o.InterfaceC59857zou;
import o.InterfaceC59858zov;
import o.InterfaceC59862zoz;
import org.apache.httpcore.ParseException;
import org.apache.httpcore.message.BasicNameValuePair;
import org.apache.httpcore.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes24.dex */
public final class ContentType implements Serializable {
    public static final ContentType APPLICATION_ATOM_XML;
    public static final ContentType APPLICATION_FORM_URLENCODED;
    public static final ContentType APPLICATION_JSON;
    public static final ContentType APPLICATION_OCTET_STREAM;
    public static final ContentType APPLICATION_SVG_XML;
    public static final ContentType APPLICATION_XHTML_XML;
    public static final ContentType APPLICATION_XML;
    private static final Map<String, ContentType> CONTENT_TYPE_MAP;
    public static final ContentType DEFAULT_BINARY;
    public static final ContentType DEFAULT_TEXT;
    public static final ContentType IMAGE_BMP;
    public static final ContentType IMAGE_GIF;
    public static final ContentType IMAGE_JPEG;
    public static final ContentType IMAGE_PNG;
    public static final ContentType IMAGE_SVG;
    public static final ContentType IMAGE_TIFF;
    public static final ContentType IMAGE_WEBP;
    public static final ContentType MULTIPART_FORM_DATA;
    public static final ContentType TEXT_HTML;
    public static final ContentType TEXT_PLAIN;
    public static final ContentType TEXT_XML;
    public static final ContentType WILDCARD;
    private static final long serialVersionUID = -7768694718232371896L;
    private final Charset charset;
    private final String mimeType;
    private final InterfaceC59862zoz[] params;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Charset getCharset() {
        return this.charset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getMimeType() {
        return this.mimeType;
    }

    static {
        Charset charset = C59861zoy.KWHzl;
        ContentType contentTypeCreate = create("application/atom+xml", charset);
        APPLICATION_ATOM_XML = contentTypeCreate;
        ContentType contentTypeCreate2 = create("application/x-www-form-urlencoded", charset);
        APPLICATION_FORM_URLENCODED = contentTypeCreate2;
        ContentType contentTypeCreate3 = create("application/json", C59861zoy.EZpvd);
        APPLICATION_JSON = contentTypeCreate3;
        APPLICATION_OCTET_STREAM = create(OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE, (Charset) null);
        ContentType contentTypeCreate4 = create("application/svg+xml", charset);
        APPLICATION_SVG_XML = contentTypeCreate4;
        ContentType contentTypeCreate5 = create("application/xhtml+xml", charset);
        APPLICATION_XHTML_XML = contentTypeCreate5;
        ContentType contentTypeCreate6 = create("application/xml", charset);
        APPLICATION_XML = contentTypeCreate6;
        ContentType contentTypeCreate7 = create("image/bmp");
        IMAGE_BMP = contentTypeCreate7;
        ContentType contentTypeCreate8 = create("image/gif");
        IMAGE_GIF = contentTypeCreate8;
        ContentType contentTypeCreate9 = create("image/jpeg");
        IMAGE_JPEG = contentTypeCreate9;
        ContentType contentTypeCreate10 = create("image/png");
        IMAGE_PNG = contentTypeCreate10;
        ContentType contentTypeCreate11 = create("image/svg+xml");
        IMAGE_SVG = contentTypeCreate11;
        ContentType contentTypeCreate12 = create("image/tiff");
        IMAGE_TIFF = contentTypeCreate12;
        ContentType contentTypeCreate13 = create("image/webp");
        IMAGE_WEBP = contentTypeCreate13;
        ContentType contentTypeCreate14 = create(ShareTarget.ENCODING_TYPE_MULTIPART, charset);
        MULTIPART_FORM_DATA = contentTypeCreate14;
        ContentType contentTypeCreate15 = create("text/html", charset);
        TEXT_HTML = contentTypeCreate15;
        ContentType contentTypeCreate16 = create("text/plain", charset);
        TEXT_PLAIN = contentTypeCreate16;
        ContentType contentTypeCreate17 = create("text/xml", charset);
        TEXT_XML = contentTypeCreate17;
        WILDCARD = create("*/*", (Charset) null);
        ContentType[] contentTypeArr = {contentTypeCreate, contentTypeCreate2, contentTypeCreate3, contentTypeCreate4, contentTypeCreate5, contentTypeCreate6, contentTypeCreate7, contentTypeCreate8, contentTypeCreate9, contentTypeCreate10, contentTypeCreate11, contentTypeCreate12, contentTypeCreate13, contentTypeCreate14, contentTypeCreate15, contentTypeCreate16, contentTypeCreate17};
        HashMap map = new HashMap();
        for (int i = 0; i < 17; i++) {
            ContentType contentType = contentTypeArr[i];
            map.put(contentType.getMimeType(), contentType);
        }
        CONTENT_TYPE_MAP = Collections.unmodifiableMap(map);
        DEFAULT_TEXT = TEXT_PLAIN;
        DEFAULT_BINARY = APPLICATION_OCTET_STREAM;
    }

    public ContentType(String str, Charset charset) {
        this.mimeType = str;
        this.charset = charset;
        this.params = null;
    }

    public ContentType(String str, Charset charset, InterfaceC59862zoz[] interfaceC59862zozArr) {
        this.mimeType = str;
        this.charset = charset;
        this.params = interfaceC59862zozArr;
    }

    public String getParameter(String str) {
        C59825zoO.OLrzqt(str, "Parameter name");
        InterfaceC59862zoz[] interfaceC59862zozArr = this.params;
        if (interfaceC59862zozArr == null) {
            return null;
        }
        for (InterfaceC59862zoz interfaceC59862zoz : interfaceC59862zozArr) {
            if (interfaceC59862zoz.getName().equalsIgnoreCase(str)) {
                return interfaceC59862zoz.getValue();
            }
        }
        return null;
    }

    public String toString() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(64);
        charArrayBuffer.append(this.mimeType);
        if (this.params != null) {
            charArrayBuffer.append("; ");
            C59815zoE.EZpvd.AEQbTJ(charArrayBuffer, this.params, false);
        } else if (this.charset != null) {
            charArrayBuffer.append("; charset=");
            charArrayBuffer.append(this.charset.name());
        }
        return charArrayBuffer.toString();
    }

    private static boolean valid(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\"' || cCharAt == ',' || cCharAt == ';') {
                return false;
            }
        }
        return true;
    }

    public static ContentType create(String str, Charset charset) {
        String lowerCase = ((String) C59825zoO.copydefault(str, "MIME type")).toLowerCase(Locale.ROOT);
        C59825zoO.KWHzl(valid(lowerCase), "MIME type may not contain reserved characters");
        return new ContentType(lowerCase, charset);
    }

    public static ContentType create(String str) {
        return create(str, (Charset) null);
    }

    public static ContentType create(String str, String str2) throws UnsupportedCharsetException {
        return create(str, !C59827zoQ.copydefault(str2) ? Charset.forName(str2) : null);
    }

    private static ContentType create(InterfaceC59857zou interfaceC59857zou, boolean z) {
        return create(interfaceC59857zou.KWHzl(), interfaceC59857zou.OLrzqt(), z);
    }

    private static ContentType create(String str, InterfaceC59862zoz[] interfaceC59862zozArr, boolean z) {
        Charset charsetForName;
        int length = interfaceC59862zozArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            InterfaceC59862zoz interfaceC59862zoz = interfaceC59862zozArr[i];
            if (interfaceC59862zoz.getName().equalsIgnoreCase("charset")) {
                String value = interfaceC59862zoz.getValue();
                if (!C59827zoQ.copydefault(value)) {
                    try {
                        charsetForName = Charset.forName(value);
                    } catch (UnsupportedCharsetException e) {
                        if (z) {
                            throw e;
                        }
                        charsetForName = null;
                        if (interfaceC59862zozArr.length <= 0) {
                            interfaceC59862zozArr = null;
                        }
                        return new ContentType(str, charsetForName, interfaceC59862zozArr);
                    }
                }
            } else {
                i++;
            }
        }
    }

    public static ContentType create(String str, InterfaceC59862zoz... interfaceC59862zozArr) throws UnsupportedCharsetException {
        C59825zoO.KWHzl(valid(((String) C59825zoO.copydefault(str, "MIME type")).toLowerCase(Locale.ROOT)), "MIME type may not contain reserved characters");
        return create(str, interfaceC59862zozArr, true);
    }

    public static ContentType parse(String str) throws ParseException, UnsupportedCharsetException {
        C59825zoO.copydefault(str, "Content type");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        InterfaceC59857zou[] interfaceC59857zouArrAEQbTJ = C59818zoH.copydefault.AEQbTJ(charArrayBuffer, new C59822zoL(0, str.length()));
        if (interfaceC59857zouArrAEQbTJ.length > 0) {
            return create(interfaceC59857zouArrAEQbTJ[0], true);
        }
        throw new ParseException("Invalid content type: " + str);
    }

    public static ContentType get(InterfaceC59813zoC interfaceC59813zoC) throws ParseException, UnsupportedCharsetException {
        InterfaceC59858zov interfaceC59858zovAEQbTJ;
        if (interfaceC59813zoC != null && (interfaceC59858zovAEQbTJ = interfaceC59813zoC.AEQbTJ()) != null) {
            InterfaceC59857zou[] elements = interfaceC59858zovAEQbTJ.getElements();
            if (elements.length > 0) {
                return create(elements[0], true);
            }
        }
        return null;
    }

    public static ContentType getLenient(InterfaceC59813zoC interfaceC59813zoC) {
        InterfaceC59858zov interfaceC59858zovAEQbTJ;
        if (interfaceC59813zoC != null && (interfaceC59858zovAEQbTJ = interfaceC59813zoC.AEQbTJ()) != null) {
            try {
                InterfaceC59857zou[] elements = interfaceC59858zovAEQbTJ.getElements();
                if (elements.length > 0) {
                    return create(elements[0], false);
                }
            } catch (ParseException unused) {
            }
        }
        return null;
    }

    public static ContentType getOrDefault(InterfaceC59813zoC interfaceC59813zoC) throws ParseException, UnsupportedCharsetException {
        ContentType contentType = get(interfaceC59813zoC);
        return contentType != null ? contentType : DEFAULT_TEXT;
    }

    public static ContentType getLenientOrDefault(InterfaceC59813zoC interfaceC59813zoC) throws ParseException, UnsupportedCharsetException {
        ContentType contentType = get(interfaceC59813zoC);
        return contentType != null ? contentType : DEFAULT_TEXT;
    }

    public static ContentType getByMimeType(String str) {
        if (str == null) {
            return null;
        }
        return CONTENT_TYPE_MAP.get(str);
    }

    public ContentType withCharset(Charset charset) {
        return create(getMimeType(), charset);
    }

    public ContentType withCharset(String str) {
        return create(getMimeType(), str);
    }

    public ContentType withParameters(InterfaceC59862zoz... interfaceC59862zozArr) throws UnsupportedCharsetException {
        if (interfaceC59862zozArr.length == 0) {
            return this;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC59862zoz[] interfaceC59862zozArr2 = this.params;
        if (interfaceC59862zozArr2 != null) {
            for (InterfaceC59862zoz interfaceC59862zoz : interfaceC59862zozArr2) {
                linkedHashMap.put(interfaceC59862zoz.getName(), interfaceC59862zoz.getValue());
            }
        }
        for (InterfaceC59862zoz interfaceC59862zoz2 : interfaceC59862zozArr) {
            linkedHashMap.put(interfaceC59862zoz2.getName(), interfaceC59862zoz2.getValue());
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size() + 1);
        if (this.charset != null && !linkedHashMap.containsKey("charset")) {
            arrayList.add(new BasicNameValuePair("charset", this.charset.name()));
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new BasicNameValuePair((String) entry.getKey(), (String) entry.getValue()));
        }
        return create(getMimeType(), (InterfaceC59862zoz[]) arrayList.toArray(new InterfaceC59862zoz[arrayList.size()]), true);
    }
}
