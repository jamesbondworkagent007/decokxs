package com.fasterxml.jackson.core.util;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class RequestPayload implements Serializable {
    private static final long serialVersionUID = 1;
    protected String _charset;
    protected byte[] _payloadAsBytes;
    protected CharSequence _payloadAsText;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Object getRawPayload() {
        byte[] bArr = this._payloadAsBytes;
        return bArr != null ? bArr : this._payloadAsText;
    }

    public RequestPayload(byte[] bArr, String str) {
        if (bArr == null) {
            throw new IllegalArgumentException();
        }
        this._payloadAsBytes = bArr;
        this._charset = (str == null || str.isEmpty()) ? C.UTF8_NAME : str;
    }

    public RequestPayload(CharSequence charSequence) {
        if (charSequence == null) {
            throw new IllegalArgumentException();
        }
        this._payloadAsText = charSequence;
    }

    public String toString() {
        byte[] bArr = this._payloadAsBytes;
        if (bArr != null) {
            try {
                return new String(bArr, this._charset);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return this._payloadAsText.toString();
    }
}
