package org.apache.http.impl.auth;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import o.AbstractC59682zle;
import o.C59514ziV;
import o.C59761znD;
import o.C59771znN;
import o.C59847zok;
import o.InterfaceC59517ziY;
import o.InterfaceC59577zjf;
import org.apache.http.auth.ChallengeState;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes13.dex */
public abstract class RFC2617Scheme extends AbstractC59682zle implements Serializable {
    private static final long serialVersionUID = -2845454858205884623L;
    private transient Charset credentialsCharset;
    private final Map<String, String> params;

    private void readObjectNoData() throws ObjectStreamException {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, String> getParameters() {
        return this.params;
    }

    @Deprecated
    public RFC2617Scheme(ChallengeState challengeState) {
        super(challengeState);
        this.params = new HashMap();
        this.credentialsCharset = C59514ziV.EZpvd;
    }

    public RFC2617Scheme(Charset charset) {
        this.params = new HashMap();
        this.credentialsCharset = charset == null ? C59514ziV.EZpvd : charset;
    }

    public RFC2617Scheme() {
        this(C59514ziV.EZpvd);
    }

    public Charset getCredentialsCharset() {
        Charset charset = this.credentialsCharset;
        return charset != null ? charset : C59514ziV.EZpvd;
    }

    public String getCredentialsCharset(InterfaceC59577zjf interfaceC59577zjf) {
        String str = (String) interfaceC59577zjf.getParams().getParameter("http.auth.credential-charset");
        return str == null ? getCredentialsCharset().name() : str;
    }

    @Override // o.AbstractC59682zle
    public void parseChallenge(CharArrayBuffer charArrayBuffer, int i, int i2) throws MalformedChallengeException {
        InterfaceC59517ziY[] interfaceC59517ziYArrOLrzqt = C59761znD.EZpvd.OLrzqt(charArrayBuffer, new C59771znN(i, charArrayBuffer.length()));
        this.params.clear();
        for (InterfaceC59517ziY interfaceC59517ziY : interfaceC59517ziYArrOLrzqt) {
            this.params.put(interfaceC59517ziY.copydefault().toLowerCase(Locale.ROOT), interfaceC59517ziY.KWHzl());
        }
    }

    public String getParameter(String str) {
        if (str == null) {
            return null;
        }
        return this.params.get(str.toLowerCase(Locale.ROOT));
    }

    @Override // o.InterfaceC59588zjq
    public String getRealm() {
        return getParameter("realm");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeUTF(this.credentialsCharset.name());
        objectOutputStream.writeObject(this.challengeState);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Charset charsetKWHzl = C59847zok.KWHzl(objectInputStream.readUTF());
        this.credentialsCharset = charsetKWHzl;
        if (charsetKWHzl == null) {
            this.credentialsCharset = C59514ziV.EZpvd;
        }
        this.challengeState = (ChallengeState) objectInputStream.readObject();
    }
}
