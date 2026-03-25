package org.apache.http.client.utils;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Scanner;
import o.C59514ziV;
import o.C59771znN;
import o.C59777znT;
import o.C59841zoe;
import o.C59851zoo;
import o.InterfaceC59517ziY;
import o.InterfaceC59518ziZ;
import o.InterfaceC59576zje;
import o.InterfaceC59582zjk;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.entity.ContentType;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class URLEncodedUtils {
    public static final String CONTENT_TYPE = "application/x-www-form-urlencoded";
    private static final String NAME_VALUE_SEPARATOR = "=";
    private static final char QP_SEP_A = '&';
    private static final char QP_SEP_S = ';';
    private static final int RADIX = 16;
    private static final BitSet UNRESERVED = new BitSet(256);
    private static final BitSet PUNCT = new BitSet(256);
    private static final BitSet USERINFO = new BitSet(256);
    private static final BitSet PATHSAFE = new BitSet(256);
    private static final BitSet URIC = new BitSet(256);
    private static final BitSet RESERVED = new BitSet(256);
    private static final BitSet URLENCODER = new BitSet(256);

    public static List<InterfaceC59582zjk> parse(URI uri, String str) {
        return parse(uri, str != null ? Charset.forName(str) : null);
    }

    public static List<InterfaceC59582zjk> parse(URI uri, Charset charset) {
        C59851zoo.AEQbTJ(uri, "URI");
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && !rawQuery.isEmpty()) {
            return parse(rawQuery, charset);
        }
        return createEmptyList();
    }

    public static List<InterfaceC59582zjk> parse(InterfaceC59576zje interfaceC59576zje) throws IOException {
        C59851zoo.AEQbTJ(interfaceC59576zje, "HTTP entity");
        ContentType contentType = ContentType.get(interfaceC59576zje);
        if (contentType == null || !contentType.getMimeType().equalsIgnoreCase("application/x-www-form-urlencoded")) {
            return createEmptyList();
        }
        long contentLength = interfaceC59576zje.getContentLength();
        C59851zoo.copydefault(contentLength <= 2147483647L, "HTTP entity is too large");
        Charset charset = contentType.getCharset() != null ? contentType.getCharset() : C59841zoe.OLrzqt;
        InputStream content = interfaceC59576zje.getContent();
        if (content == null) {
            return createEmptyList();
        }
        try {
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(contentLength > 0 ? (int) contentLength : 1024);
            InputStreamReader inputStreamReader = new InputStreamReader(content, charset);
            char[] cArr = new char[1024];
            while (true) {
                int i = inputStreamReader.read(cArr);
                if (i == -1) {
                    break;
                }
                charArrayBuffer.append(cArr, 0, i);
            }
            content.close();
            if (charArrayBuffer.length() == 0) {
                return createEmptyList();
            }
            return parse(charArrayBuffer, charset, QP_SEP_A);
        } catch (Throwable th) {
            content.close();
            throw th;
        }
    }

    public static boolean isEncoded(InterfaceC59576zje interfaceC59576zje) {
        C59851zoo.AEQbTJ(interfaceC59576zje, "HTTP entity");
        InterfaceC59518ziZ contentType = interfaceC59576zje.getContentType();
        if (contentType != null) {
            InterfaceC59517ziY[] elements = contentType.getElements();
            if (elements.length > 0) {
                return elements[0].copydefault().equalsIgnoreCase("application/x-www-form-urlencoded");
            }
        }
        return false;
    }

    @Deprecated
    public static void parse(List<InterfaceC59582zjk> list, Scanner scanner, String str) {
        parse(list, scanner, "[&;]", str);
    }

    @Deprecated
    public static void parse(List<InterfaceC59582zjk> list, Scanner scanner, String str, String str2) {
        String strDecodeFormFields;
        String strDecodeFormFields2;
        scanner.useDelimiter(str);
        while (scanner.hasNext()) {
            String next = scanner.next();
            int iIndexOf = next.indexOf("=");
            if (iIndexOf != -1) {
                strDecodeFormFields = decodeFormFields(next.substring(0, iIndexOf).trim(), str2);
                strDecodeFormFields2 = decodeFormFields(next.substring(iIndexOf + 1).trim(), str2);
            } else {
                strDecodeFormFields = decodeFormFields(next.trim(), str2);
                strDecodeFormFields2 = null;
            }
            list.add(new BasicNameValuePair(strDecodeFormFields, strDecodeFormFields2));
        }
    }

    public static List<InterfaceC59582zjk> parse(String str, Charset charset) {
        if (str == null) {
            return createEmptyList();
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        return parse(charArrayBuffer, charset, QP_SEP_A, QP_SEP_S);
    }

    public static List<InterfaceC59582zjk> parse(String str, Charset charset, char... cArr) {
        if (str == null) {
            return createEmptyList();
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        return parse(charArrayBuffer, charset, cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List<InterfaceC59582zjk> parse(CharArrayBuffer charArrayBuffer, Charset charset, char... cArr) {
        String strCopydefault;
        C59851zoo.AEQbTJ(charArrayBuffer, "Char array buffer");
        C59777znT c59777znT = C59777znT.OLrzqt;
        BitSet bitSet = new BitSet();
        for (char c : cArr) {
            bitSet.set(c);
        }
        C59771znN c59771znN = new C59771znN(0, charArrayBuffer.length());
        ArrayList arrayList = new ArrayList();
        while (!c59771znN.copydefault()) {
            bitSet.set(61);
            String strKWHzl = c59777znT.KWHzl(charArrayBuffer, c59771znN, bitSet);
            if (!c59771znN.copydefault()) {
                char cCharAt = charArrayBuffer.charAt(c59771znN.OLrzqt());
                c59771znN.EZpvd(c59771znN.OLrzqt() + 1);
                if (cCharAt == '=') {
                    bitSet.clear(61);
                    strCopydefault = c59777znT.copydefault(charArrayBuffer, c59771znN, bitSet);
                    if (!c59771znN.copydefault()) {
                        c59771znN.EZpvd(c59771znN.OLrzqt() + 1);
                    }
                } else {
                    strCopydefault = null;
                }
            }
            if (!strKWHzl.isEmpty()) {
                arrayList.add(new BasicNameValuePair(decodeFormFields(strKWHzl, charset), decodeFormFields(strCopydefault, charset)));
            }
        }
        return arrayList;
    }

    public static String format(List<? extends InterfaceC59582zjk> list, String str) {
        return format(list, QP_SEP_A, str);
    }

    public static String format(List<? extends InterfaceC59582zjk> list, char c, String str) {
        StringBuilder sb = new StringBuilder();
        for (InterfaceC59582zjk interfaceC59582zjk : list) {
            String strEncodeFormFields = encodeFormFields(interfaceC59582zjk.getName(), str);
            String strEncodeFormFields2 = encodeFormFields(interfaceC59582zjk.getValue(), str);
            if (sb.length() > 0) {
                sb.append(c);
            }
            sb.append(strEncodeFormFields);
            if (strEncodeFormFields2 != null) {
                sb.append("=");
                sb.append(strEncodeFormFields2);
            }
        }
        return sb.toString();
    }

    public static String format(Iterable<? extends InterfaceC59582zjk> iterable, Charset charset) {
        return format(iterable, QP_SEP_A, charset);
    }

    public static String format(Iterable<? extends InterfaceC59582zjk> iterable, char c, Charset charset) {
        C59851zoo.AEQbTJ(iterable, "Parameters");
        StringBuilder sb = new StringBuilder();
        for (InterfaceC59582zjk interfaceC59582zjk : iterable) {
            String strEncodeFormFields = encodeFormFields(interfaceC59582zjk.getName(), charset);
            String strEncodeFormFields2 = encodeFormFields(interfaceC59582zjk.getValue(), charset);
            if (sb.length() > 0) {
                sb.append(c);
            }
            sb.append(strEncodeFormFields);
            if (strEncodeFormFields2 != null) {
                sb.append("=");
                sb.append(strEncodeFormFields2);
            }
        }
        return sb.toString();
    }

    static {
        for (int i = 97; i <= 122; i++) {
            UNRESERVED.set(i);
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            UNRESERVED.set(i2);
        }
        for (int i3 = 48; i3 <= 57; i3++) {
            UNRESERVED.set(i3);
        }
        BitSet bitSet = UNRESERVED;
        bitSet.set(95);
        bitSet.set(45);
        bitSet.set(46);
        bitSet.set(42);
        URLENCODER.or(bitSet);
        bitSet.set(33);
        bitSet.set(WebSocketProtocol.PAYLOAD_SHORT);
        bitSet.set(39);
        bitSet.set(40);
        bitSet.set(41);
        BitSet bitSet2 = PUNCT;
        bitSet2.set(44);
        bitSet2.set(59);
        bitSet2.set(58);
        bitSet2.set(36);
        bitSet2.set(38);
        bitSet2.set(43);
        bitSet2.set(61);
        BitSet bitSet3 = USERINFO;
        bitSet3.or(bitSet);
        bitSet3.or(bitSet2);
        BitSet bitSet4 = PATHSAFE;
        bitSet4.or(bitSet);
        bitSet4.set(47);
        bitSet4.set(59);
        bitSet4.set(58);
        bitSet4.set(64);
        bitSet4.set(38);
        bitSet4.set(61);
        bitSet4.set(43);
        bitSet4.set(36);
        bitSet4.set(44);
        BitSet bitSet5 = RESERVED;
        bitSet5.set(59);
        bitSet5.set(47);
        bitSet5.set(63);
        bitSet5.set(58);
        bitSet5.set(64);
        bitSet5.set(38);
        bitSet5.set(61);
        bitSet5.set(43);
        bitSet5.set(36);
        bitSet5.set(44);
        bitSet5.set(91);
        bitSet5.set(93);
        BitSet bitSet6 = URIC;
        bitSet6.or(bitSet5);
        bitSet6.or(bitSet);
    }

    private static List<InterfaceC59582zjk> createEmptyList() {
        return new ArrayList(0);
    }

    private static String urlEncode(String str, Charset charset, BitSet bitSet, boolean z) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        ByteBuffer byteBufferEncode = charset.encode(str);
        while (byteBufferEncode.hasRemaining()) {
            byte b = byteBufferEncode.get();
            int i = b & UnsignedBytes.MAX_VALUE;
            if (bitSet.get(i)) {
                sb.append((char) i);
            } else if (z && i == 32) {
                sb.append('+');
            } else {
                sb.append("%");
                char upperCase = Character.toUpperCase(Character.forDigit((i >> 4) & 15, 16));
                char upperCase2 = Character.toUpperCase(Character.forDigit(b & Ascii.SI, 16));
                sb.append(upperCase);
                sb.append(upperCase2);
            }
        }
        return sb.toString();
    }

    private static String urlDecode(String str, Charset charset, boolean z) {
        if (str == null) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(str.length());
        CharBuffer charBufferWrap = CharBuffer.wrap(str);
        while (charBufferWrap.hasRemaining()) {
            char c = charBufferWrap.get();
            if (c == '%' && charBufferWrap.remaining() >= 2) {
                char c2 = charBufferWrap.get();
                char c3 = charBufferWrap.get();
                int iDigit = Character.digit(c2, 16);
                int iDigit2 = Character.digit(c3, 16);
                if (iDigit != -1 && iDigit2 != -1) {
                    byteBufferAllocate.put((byte) ((iDigit << 4) + iDigit2));
                } else {
                    byteBufferAllocate.put((byte) 37);
                    byteBufferAllocate.put((byte) c2);
                    byteBufferAllocate.put((byte) c3);
                }
            } else if (z && c == '+') {
                byteBufferAllocate.put((byte) 32);
            } else {
                byteBufferAllocate.put((byte) c);
            }
        }
        byteBufferAllocate.flip();
        return charset.decode(byteBufferAllocate).toString();
    }

    private static String decodeFormFields(String str, String str2) {
        if (str == null) {
            return null;
        }
        return urlDecode(str, str2 != null ? Charset.forName(str2) : C59514ziV.KWHzl, true);
    }

    private static String decodeFormFields(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = C59514ziV.KWHzl;
        }
        return urlDecode(str, charset, true);
    }

    private static String encodeFormFields(String str, String str2) {
        if (str == null) {
            return null;
        }
        return urlEncode(str, str2 != null ? Charset.forName(str2) : C59514ziV.KWHzl, URLENCODER, true);
    }

    private static String encodeFormFields(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = C59514ziV.KWHzl;
        }
        return urlEncode(str, charset, URLENCODER, true);
    }

    public static String encUserInfo(String str, Charset charset) {
        return urlEncode(str, charset, USERINFO, false);
    }

    public static String encUric(String str, Charset charset) {
        return urlEncode(str, charset, URIC, false);
    }

    public static String encPath(String str, Charset charset) {
        return urlEncode(str, charset, PATHSAFE, false);
    }
}
