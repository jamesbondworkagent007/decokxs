package com.ibm.icu.text;

import com.ibm.icu.text.MessagePattern;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import o.C7070acr;

/* JADX INFO: loaded from: classes3.dex */
public class SelectFormat extends Format {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long serialVersionUID = 2993154333257524984L;
    private transient MessagePattern msgPattern;
    private String pattern = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toPattern() {
        return this.pattern;
    }

    public SelectFormat(String str) {
        applyPattern(str);
    }

    private void reset() {
        this.pattern = null;
        MessagePattern messagePattern = this.msgPattern;
        if (messagePattern != null) {
            messagePattern.EZpvd();
        }
    }

    public void applyPattern(String str) {
        this.pattern = str;
        if (this.msgPattern == null) {
            this.msgPattern = new MessagePattern();
        }
        try {
            this.msgPattern.EZpvd(str);
        } catch (RuntimeException e) {
            reset();
            throw e;
        }
    }

    public static int findSubMessage(MessagePattern messagePattern, int i, String str) {
        int iOLrzqt = messagePattern.OLrzqt();
        int i2 = 0;
        do {
            int i3 = i + 1;
            MessagePattern.Part partEZpvd = messagePattern.EZpvd(i);
            if (partEZpvd.copydefault() == MessagePattern.Part.Type.ARG_LIMIT) {
                break;
            }
            if (messagePattern.copydefault(partEZpvd, str)) {
                return i3;
            }
            if (i2 == 0 && messagePattern.copydefault(partEZpvd, "other")) {
                i2 = i3;
            }
            i = messagePattern.KWHzl(i3) + 1;
        } while (i < iOLrzqt);
        return i2;
    }

    public final String format(String str) {
        int iOLrzqt;
        if (!C7070acr.KWHzl(str)) {
            throw new IllegalArgumentException("Invalid formatting argument.");
        }
        MessagePattern messagePattern = this.msgPattern;
        if (messagePattern == null || messagePattern.OLrzqt() == 0) {
            throw new IllegalStateException("Invalid format error.");
        }
        int iFindSubMessage = findSubMessage(this.msgPattern, 0, str);
        if (!this.msgPattern.valueOf()) {
            return this.msgPattern.djBIcL().substring(this.msgPattern.EZpvd(iFindSubMessage).EZpvd(), this.msgPattern.copydefault(this.msgPattern.KWHzl(iFindSubMessage)));
        }
        int iEZpvd = this.msgPattern.EZpvd(iFindSubMessage).EZpvd();
        StringBuilder sb = null;
        while (true) {
            iFindSubMessage++;
            MessagePattern.Part partEZpvd = this.msgPattern.EZpvd(iFindSubMessage);
            MessagePattern.Part.Type typeCopydefault = partEZpvd.copydefault();
            iOLrzqt = partEZpvd.OLrzqt();
            if (typeCopydefault == MessagePattern.Part.Type.MSG_LIMIT) {
                break;
            }
            if (typeCopydefault == MessagePattern.Part.Type.SKIP_SYNTAX) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append((CharSequence) this.pattern, iEZpvd, iOLrzqt);
                iEZpvd = partEZpvd.EZpvd();
            } else if (typeCopydefault == MessagePattern.Part.Type.ARG_START) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append((CharSequence) this.pattern, iEZpvd, iOLrzqt);
                iFindSubMessage = this.msgPattern.KWHzl(iFindSubMessage);
                iEZpvd = this.msgPattern.EZpvd(iFindSubMessage).EZpvd();
                MessagePattern.OLrzqt(this.pattern, iOLrzqt, iEZpvd, sb);
            }
        }
        if (sb == null) {
            return this.pattern.substring(iEZpvd, iOLrzqt);
        }
        sb.append((CharSequence) this.pattern, iEZpvd, iOLrzqt);
        return sb.toString();
    }

    @Override // java.text.Format
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (obj instanceof String) {
            stringBuffer.append(format((String) obj));
            return stringBuffer;
        }
        throw new IllegalArgumentException("'" + obj + "' is not a String");
    }

    @Override // java.text.Format
    public Object parseObject(String str, ParsePosition parsePosition) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MessagePattern messagePattern = this.msgPattern;
        MessagePattern messagePattern2 = ((SelectFormat) obj).msgPattern;
        return messagePattern == null ? messagePattern2 == null : messagePattern.equals(messagePattern2);
    }

    public int hashCode() {
        String str = this.pattern;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "pattern='" + this.pattern + "'";
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        String str = this.pattern;
        if (str != null) {
            applyPattern(str);
        }
    }
}
