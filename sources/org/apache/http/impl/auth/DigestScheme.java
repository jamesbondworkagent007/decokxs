package org.apache.http.impl.auth;

import androidx.autofill.HintConstants;
import com.google.common.base.Ascii;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Locale;
import java.util.StringTokenizer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C59514ziV;
import o.C59687zlj;
import o.C59763znF;
import o.C59782znY;
import o.C59851zoo;
import o.C59856zot;
import o.InterfaceC59518ziZ;
import o.InterfaceC59576zje;
import o.InterfaceC59577zjf;
import o.InterfaceC59578zjg;
import o.InterfaceC59582zjk;
import o.InterfaceC59597zjz;
import o.InterfaceC59838zob;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.ChallengeState;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class DigestScheme extends RFC2617Scheme {
    private static final char[] HEXADECIMAL = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final int QOP_AUTH = 2;
    private static final int QOP_AUTH_INT = 1;
    private static final int QOP_MISSING = 0;
    private static final int QOP_UNKNOWN = -1;
    private static final long serialVersionUID = 3883908186234566916L;
    private String a1;
    private String a2;
    private String cnonce;
    private boolean complete;
    private String lastNonce;
    private long nounceCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getA1() {
        return this.a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getA2() {
        return this.a2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getCnonce() {
        return this.cnonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59588zjq
    public String getSchemeName() {
        return "digest";
    }

    @Override // o.InterfaceC59588zjq
    public boolean isConnectionBased() {
        return false;
    }

    public DigestScheme(Charset charset) {
        super(charset);
        this.complete = false;
    }

    @Deprecated
    public DigestScheme(ChallengeState challengeState) {
        super(challengeState);
    }

    public DigestScheme() {
        this(C59514ziV.EZpvd);
    }

    @Override // o.AbstractC59682zle, o.InterfaceC59588zjq
    public void processChallenge(InterfaceC59518ziZ interfaceC59518ziZ) throws MalformedChallengeException {
        super.processChallenge(interfaceC59518ziZ);
        this.complete = true;
        if (getParameters().isEmpty()) {
            throw new MalformedChallengeException("Authentication challenge is empty");
        }
    }

    @Override // o.InterfaceC59588zjq
    public boolean isComplete() {
        if ("true".equalsIgnoreCase(getParameter("stale"))) {
            return false;
        }
        return this.complete;
    }

    public void overrideParamter(String str, String str2) {
        getParameters().put(str, str2);
    }

    @Override // o.InterfaceC59588zjq
    @Deprecated
    public InterfaceC59518ziZ authenticate(InterfaceC59597zjz interfaceC59597zjz, InterfaceC59577zjf interfaceC59577zjf) throws AuthenticationException {
        return authenticate(interfaceC59597zjz, interfaceC59577zjf, new C59782znY());
    }

    @Override // o.AbstractC59682zle, o.InterfaceC59547zjB
    public InterfaceC59518ziZ authenticate(InterfaceC59597zjz interfaceC59597zjz, InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws AuthenticationException {
        C59851zoo.AEQbTJ(interfaceC59597zjz, "Credentials");
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        if (getParameter("realm") == null) {
            throw new AuthenticationException("missing realm in challenge");
        }
        if (getParameter("nonce") == null) {
            throw new AuthenticationException("missing nonce in challenge");
        }
        getParameters().put("methodname", interfaceC59577zjf.getRequestLine().getMethod());
        getParameters().put("uri", interfaceC59577zjf.getRequestLine().getUri());
        if (getParameter("charset") == null) {
            getParameters().put("charset", getCredentialsCharset(interfaceC59577zjf));
        }
        return createDigestHeader(interfaceC59597zjz, interfaceC59577zjf);
    }

    private static MessageDigest createMessageDigest(String str) throws UnsupportedDigestAlgorithmException {
        try {
            return MessageDigest.getInstance(str);
        } catch (Exception unused) {
            throw new UnsupportedDigestAlgorithmException("Unsupported algorithm in HTTP Digest authentication: " + str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v9, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private InterfaceC59518ziZ createDigestHeader(InterfaceC59597zjz interfaceC59597zjz, InterfaceC59577zjf interfaceC59577zjf) throws AuthenticationException {
        String str;
        byte b;
        String str2;
        String str3;
        String str4;
        String str5;
        byte b2;
        int i;
        String string;
        String str6;
        String parameter = getParameter("uri");
        String parameter2 = getParameter("realm");
        String parameter3 = getParameter("nonce");
        String parameter4 = getParameter("opaque");
        String parameter5 = getParameter("methodname");
        String parameter6 = getParameter("algorithm");
        if (parameter6 == null) {
            parameter6 = "MD5";
        }
        HashSet hashSet = new HashSet(8);
        String str7 = "MD5";
        String parameter7 = getParameter("qop");
        if (parameter7 != null) {
            str = "qop";
            for (StringTokenizer stringTokenizer = new StringTokenizer(parameter7, ","); stringTokenizer.hasMoreTokens(); stringTokenizer = stringTokenizer) {
                hashSet.add(stringTokenizer.nextToken().trim().toLowerCase(Locale.ROOT));
            }
            if ((interfaceC59577zjf instanceof InterfaceC59578zjg) && hashSet.contains("auth-int")) {
                b = 1;
            } else {
                b = hashSet.contains("auth") ? (byte) 2 : (byte) -1;
            }
        } else {
            str = "qop";
            b = 0;
        }
        if (b == -1) {
            throw new AuthenticationException("None of the qop methods is supported: " + parameter7);
        }
        String parameter8 = getParameter("charset");
        if (parameter8 == null) {
            parameter8 = "ISO-8859-1";
        }
        if (parameter6.equalsIgnoreCase("MD5-sess")) {
            str2 = "auth-int";
        } else {
            str2 = "auth-int";
            str7 = parameter6;
        }
        try {
            MessageDigest messageDigestCreateMessageDigest = createMessageDigest(str7);
            String name = interfaceC59597zjz.getUserPrincipal().getName();
            String password = interfaceC59597zjz.getPassword();
            if (parameter3.equals(this.lastNonce)) {
                str3 = parameter;
                this.nounceCount++;
            } else {
                str3 = parameter;
                this.nounceCount = 1L;
                this.cnonce = null;
                this.lastNonce = parameter3;
            }
            StringBuilder sb = new StringBuilder(256);
            Formatter formatter = new Formatter(sb, Locale.US);
            formatter.format("%08x", Long.valueOf(this.nounceCount));
            formatter.close();
            String string2 = sb.toString();
            if (this.cnonce == null) {
                this.cnonce = createCnonce();
            }
            this.a1 = null;
            this.a2 = null;
            if (parameter6.equalsIgnoreCase("MD5-sess")) {
                sb.setLength(0);
                sb.append(name);
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(parameter2);
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(password);
                String strEncode = encode(messageDigestCreateMessageDigest.digest(C59856zot.KWHzl(sb.toString(), parameter8)));
                sb.setLength(0);
                sb.append(strEncode);
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(parameter3);
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(this.cnonce);
                this.a1 = sb.toString();
            } else {
                sb.setLength(0);
                sb.append(name);
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(parameter2);
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(password);
                this.a1 = sb.toString();
            }
            String strEncode2 = encode(messageDigestCreateMessageDigest.digest(C59856zot.KWHzl(this.a1, parameter8)));
            if (b == 2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(parameter5);
                sb2.append(AbstractJsonLexerKt.COLON);
                str4 = str3;
                sb2.append(str4);
                this.a2 = sb2.toString();
                str5 = "auth";
            } else {
                str4 = str3;
                if (b == 1) {
                    InterfaceC59576zje entity = interfaceC59577zjf instanceof InterfaceC59578zjg ? ((InterfaceC59578zjg) interfaceC59577zjf).getEntity() : null;
                    if (entity != null && !entity.isRepeatable()) {
                        str5 = "auth";
                        if (!hashSet.contains(str5)) {
                            throw new AuthenticationException("Qop auth-int cannot be used with a non-repeatable entity");
                        }
                        this.a2 = parameter5 + AbstractJsonLexerKt.COLON + str4;
                        b2 = 2;
                    } else {
                        str5 = "auth";
                        C59687zlj c59687zlj = new C59687zlj(messageDigestCreateMessageDigest);
                        if (entity != null) {
                            try {
                                entity.writeTo(c59687zlj);
                            } catch (IOException e) {
                                throw new AuthenticationException("I/O error reading entity content", e);
                            }
                        }
                        c59687zlj.close();
                        this.a2 = parameter5 + AbstractJsonLexerKt.COLON + str4 + AbstractJsonLexerKt.COLON + encode(c59687zlj.EZpvd());
                        b2 = b;
                    }
                    b = b2;
                } else {
                    str5 = "auth";
                    this.a2 = parameter5 + AbstractJsonLexerKt.COLON + str4;
                }
            }
            String strEncode3 = encode(messageDigestCreateMessageDigest.digest(C59856zot.KWHzl(this.a2, parameter8)));
            if (b == 0) {
                i = 0;
                sb.setLength(0);
                sb.append(strEncode2);
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(parameter3);
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(strEncode3);
                string = sb.toString();
            } else {
                i = 0;
                sb.setLength(0);
                sb.append(strEncode2);
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(parameter3);
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(string2);
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(this.cnonce);
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(b == 1 ? str2 : str5);
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(strEncode3);
                string = sb.toString();
            }
            String strEncode4 = encode(messageDigestCreateMessageDigest.digest(C59856zot.AEQbTJ(string)));
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(128);
            if (isProxy()) {
                charArrayBuffer.append(HttpHeaders.PROXY_AUTHORIZATION);
            } else {
                charArrayBuffer.append("Authorization");
            }
            charArrayBuffer.append(": Digest ");
            ArrayList arrayList = new ArrayList(20);
            arrayList.add(new BasicNameValuePair(HintConstants.AUTOFILL_HINT_USERNAME, name));
            arrayList.add(new BasicNameValuePair("realm", parameter2));
            arrayList.add(new BasicNameValuePair("nonce", parameter3));
            arrayList.add(new BasicNameValuePair("uri", str4));
            arrayList.add(new BasicNameValuePair("response", strEncode4));
            if (b != 0) {
                str6 = str;
                arrayList.add(new BasicNameValuePair(str6, b == 1 ? str2 : str5));
                arrayList.add(new BasicNameValuePair("nc", string2));
                arrayList.add(new BasicNameValuePair("cnonce", this.cnonce));
            } else {
                str6 = str;
            }
            arrayList.add(new BasicNameValuePair("algorithm", parameter6));
            if (parameter4 != null) {
                arrayList.add(new BasicNameValuePair("opaque", parameter4));
            }
            for (int i2 = i; i2 < arrayList.size(); i2++) {
                InterfaceC59582zjk interfaceC59582zjk = (BasicNameValuePair) arrayList.get(i2);
                if (i2 > 0) {
                    charArrayBuffer.append(", ");
                }
                String name2 = interfaceC59582zjk.getName();
                C59763znF.OLrzqt.EZpvd(charArrayBuffer, interfaceC59582zjk, (("nc".equals(name2) || str6.equals(name2) || "algorithm".equals(name2)) ? 1 : i) ^ 1);
            }
            return new BufferedHeader(charArrayBuffer);
        } catch (UnsupportedDigestAlgorithmException unused) {
            throw new AuthenticationException("Unsuppported digest algorithm: " + str7);
        }
    }

    public static String encode(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length * 2];
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = HEXADECIMAL;
            cArr[i2] = cArr2[(b & 240) >> 4];
            cArr[i2 + 1] = cArr2[b & Ascii.SI];
        }
        return new String(cArr);
    }

    public static String createCnonce() {
        byte[] bArr = new byte[8];
        new SecureRandom().nextBytes(bArr);
        return encode(bArr);
    }

    @Override // o.AbstractC59682zle
    public String toString() {
        return "DIGEST [complete=" + this.complete + ", nonce=" + this.lastNonce + ", nc=" + this.nounceCount + "]";
    }
}
