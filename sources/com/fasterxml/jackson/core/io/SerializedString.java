package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import o.C5519Uv;
import o.InterfaceC5501Ue;

/* JADX INFO: loaded from: classes21.dex */
public class SerializedString implements InterfaceC5501Ue, Serializable {
    private static final C5519Uv JSON_ENCODER = C5519Uv.AEQbTJ();
    private static final long serialVersionUID = 1;
    protected transient String _jdkSerializeValue;
    protected char[] _quotedChars;
    protected byte[] _quotedUTF8Ref;
    protected byte[] _unquotedUTF8Ref;
    protected final String _value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5501Ue
    public final String getValue() {
        return this._value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String toString() {
        return this._value;
    }

    public SerializedString(String str) {
        if (str == null) {
            throw new IllegalStateException("Null String illegal for SerializedString");
        }
        this._value = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        this._jdkSerializeValue = objectInputStream.readUTF();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this._value);
    }

    public Object readResolve() {
        return new SerializedString(this._jdkSerializeValue);
    }

    public final int charLength() {
        return this._value.length();
    }

    @Override // o.InterfaceC5501Ue
    public final char[] asQuotedChars() {
        char[] cArr = this._quotedChars;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrCopydefault = JSON_ENCODER.copydefault(this._value);
        this._quotedChars = cArrCopydefault;
        return cArrCopydefault;
    }

    @Override // o.InterfaceC5501Ue
    public final byte[] asQuotedUTF8() {
        byte[] bArr = this._quotedUTF8Ref;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrKWHzl = JSON_ENCODER.KWHzl(this._value);
        this._quotedUTF8Ref = bArrKWHzl;
        return bArrKWHzl;
    }

    @Override // o.InterfaceC5501Ue
    public final byte[] asUnquotedUTF8() {
        byte[] bArr = this._unquotedUTF8Ref;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrAEQbTJ = JSON_ENCODER.AEQbTJ(this._value);
        this._unquotedUTF8Ref = bArrAEQbTJ;
        return bArrAEQbTJ;
    }

    @Override // o.InterfaceC5501Ue
    public int appendQuoted(char[] cArr, int i) {
        char[] cArrCopydefault = this._quotedChars;
        if (cArrCopydefault == null) {
            cArrCopydefault = JSON_ENCODER.copydefault(this._value);
            this._quotedChars = cArrCopydefault;
        }
        int length = cArrCopydefault.length;
        if (i + length > cArr.length) {
            return -1;
        }
        System.arraycopy(cArrCopydefault, 0, cArr, i, length);
        return length;
    }

    @Override // o.InterfaceC5501Ue
    public int appendQuotedUTF8(byte[] bArr, int i) {
        byte[] bArrKWHzl = this._quotedUTF8Ref;
        if (bArrKWHzl == null) {
            bArrKWHzl = JSON_ENCODER.KWHzl(this._value);
            this._quotedUTF8Ref = bArrKWHzl;
        }
        int length = bArrKWHzl.length;
        if (i + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArrKWHzl, 0, bArr, i, length);
        return length;
    }

    @Override // o.InterfaceC5501Ue
    public int appendUnquoted(char[] cArr, int i) {
        String str = this._value;
        int length = str.length();
        if (i + length > cArr.length) {
            return -1;
        }
        str.getChars(0, length, cArr, i);
        return length;
    }

    @Override // o.InterfaceC5501Ue
    public int appendUnquotedUTF8(byte[] bArr, int i) {
        byte[] bArrAEQbTJ = this._unquotedUTF8Ref;
        if (bArrAEQbTJ == null) {
            bArrAEQbTJ = JSON_ENCODER.AEQbTJ(this._value);
            this._unquotedUTF8Ref = bArrAEQbTJ;
        }
        int length = bArrAEQbTJ.length;
        if (i + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArrAEQbTJ, 0, bArr, i, length);
        return length;
    }

    public int writeQuotedUTF8(OutputStream outputStream) throws IOException {
        byte[] bArrKWHzl = this._quotedUTF8Ref;
        if (bArrKWHzl == null) {
            bArrKWHzl = JSON_ENCODER.KWHzl(this._value);
            this._quotedUTF8Ref = bArrKWHzl;
        }
        int length = bArrKWHzl.length;
        outputStream.write(bArrKWHzl, 0, length);
        return length;
    }

    public int writeUnquotedUTF8(OutputStream outputStream) throws IOException {
        byte[] bArrAEQbTJ = this._unquotedUTF8Ref;
        if (bArrAEQbTJ == null) {
            bArrAEQbTJ = JSON_ENCODER.AEQbTJ(this._value);
            this._unquotedUTF8Ref = bArrAEQbTJ;
        }
        int length = bArrAEQbTJ.length;
        outputStream.write(bArrAEQbTJ, 0, length);
        return length;
    }

    public int putQuotedUTF8(ByteBuffer byteBuffer) {
        byte[] bArrKWHzl = this._quotedUTF8Ref;
        if (bArrKWHzl == null) {
            bArrKWHzl = JSON_ENCODER.KWHzl(this._value);
            this._quotedUTF8Ref = bArrKWHzl;
        }
        int length = bArrKWHzl.length;
        if (length > byteBuffer.remaining()) {
            return -1;
        }
        byteBuffer.put(bArrKWHzl, 0, length);
        return length;
    }

    public int putUnquotedUTF8(ByteBuffer byteBuffer) {
        byte[] bArrAEQbTJ = this._unquotedUTF8Ref;
        if (bArrAEQbTJ == null) {
            bArrAEQbTJ = JSON_ENCODER.AEQbTJ(this._value);
            this._unquotedUTF8Ref = bArrAEQbTJ;
        }
        int length = bArrAEQbTJ.length;
        if (length > byteBuffer.remaining()) {
            return -1;
        }
        byteBuffer.put(bArrAEQbTJ, 0, length);
        return length;
    }

    public final int hashCode() {
        return this._value.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this._value.equals(((SerializedString) obj)._value);
    }
}
