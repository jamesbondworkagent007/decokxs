package org.jdom2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.C59868zpE;
import o.C59874zpK;
import org.jdom2.Content;

/* JADX INFO: loaded from: classes24.dex */
public class ProcessingInstruction extends Content {
    private static final long serialVersionUID = 200;
    protected transient Map<String, String> mapData;
    protected String rawData;
    protected String target;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getData() {
        return this.rawData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getTarget() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.jdom2.Content
    public String getValue() {
        return this.rawData;
    }

    public ProcessingInstruction() {
        super(Content.CType.ProcessingInstruction);
        this.mapData = null;
    }

    public ProcessingInstruction(String str) {
        this(str, "");
    }

    public ProcessingInstruction(String str, Map<String, String> map) {
        super(Content.CType.ProcessingInstruction);
        this.mapData = null;
        setTarget(str);
        setData(map);
    }

    public ProcessingInstruction(String str, String str2) {
        super(Content.CType.ProcessingInstruction);
        this.mapData = null;
        setTarget(str);
        setData(str2);
    }

    public ProcessingInstruction setTarget(String str) {
        String strGEmmrt = C59868zpE.gEmmrt(str);
        if (strGEmmrt != null) {
            throw new IllegalTargetException(str, strGEmmrt);
        }
        this.target = str;
        return this;
    }

    public List<String> getPseudoAttributeNames() {
        return new ArrayList(this.mapData.keySet());
    }

    public ProcessingInstruction setData(String str) {
        String strValueOf = C59868zpE.valueOf(str);
        if (strValueOf != null) {
            throw new IllegalDataException(str, strValueOf);
        }
        this.rawData = str;
        this.mapData = parseData(str);
        return this;
    }

    public ProcessingInstruction setData(Map<String, String> map) {
        String string = toString(map);
        String strValueOf = C59868zpE.valueOf(string);
        if (strValueOf != null) {
            throw new IllegalDataException(string, strValueOf);
        }
        this.rawData = string;
        this.mapData = new LinkedHashMap(map);
        return this;
    }

    public String getPseudoAttributeValue(String str) {
        return this.mapData.get(str);
    }

    public ProcessingInstruction setPseudoAttribute(String str, String str2) {
        String strValueOf = C59868zpE.valueOf(str);
        if (strValueOf != null) {
            throw new IllegalDataException(str, strValueOf);
        }
        String strValueOf2 = C59868zpE.valueOf(str2);
        if (strValueOf2 != null) {
            throw new IllegalDataException(str2, strValueOf2);
        }
        this.mapData.put(str, str2);
        this.rawData = toString(this.mapData);
        return this;
    }

    public boolean removePseudoAttribute(String str) {
        if (this.mapData.remove(str) == null) {
            return false;
        }
        this.rawData = toString(this.mapData);
        return true;
    }

    private static final String toString(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=\"");
            sb.append(entry.getValue());
            sb.append("\" ");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        r10 = r10.substring(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r2.length() <= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        r0.put(r2, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Map<String, String> parseData(String str) {
        String strSubstring;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strTrim = str.trim();
        while (true) {
            String strTrim2 = "";
            if (!strTrim.trim().equals("")) {
                char cCharAt = strTrim.charAt(0);
                int i = 0;
                int i2 = 1;
                while (true) {
                    if (i2 >= strTrim.length()) {
                        strSubstring = "";
                        break;
                    }
                    char cCharAt2 = strTrim.charAt(i2);
                    if (cCharAt2 == '=') {
                        strTrim2 = strTrim.substring(i, i2).trim();
                        int[] iArrExtractQuotedString = extractQuotedString(strTrim.substring(i2 + 1));
                        if (iArrExtractQuotedString == null) {
                            return Collections.emptyMap();
                        }
                        strSubstring = strTrim.substring(iArrExtractQuotedString[0] + i2 + 1, iArrExtractQuotedString[1] + i2 + 1);
                        i2 += iArrExtractQuotedString[1] + 1;
                    } else {
                        if (Character.isWhitespace(cCharAt) && !Character.isWhitespace(cCharAt2)) {
                            i = i2;
                        }
                        i2++;
                        cCharAt = cCharAt2;
                    }
                }
            } else {
                return linkedHashMap;
            }
        }
    }

    private static int[] extractQuotedString(String str) {
        boolean z = false;
        int i = 0;
        char c = '\"';
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\"' || cCharAt == '\'') {
                if (!z) {
                    c = cCharAt;
                    i = i2 + 1;
                    z = true;
                } else if (c == cCharAt) {
                    return new int[]{i, i2};
                }
            }
        }
        return null;
    }

    public String toString() {
        return "[ProcessingInstruction: " + new C59874zpK().EZpvd(this) + "]";
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: clone()Lo/zpy; */
    /* JADX DEBUG: Method merged with bridge method: clone()Lorg/jdom2/Content; */
    @Override // org.jdom2.Content, o.C59905zpy
    public ProcessingInstruction clone() {
        ProcessingInstruction processingInstruction = (ProcessingInstruction) super.clone();
        processingInstruction.mapData = parseData(this.rawData);
        return processingInstruction;
    }

    /* JADX DEBUG: Method merged with bridge method: detach()Lorg/jdom2/Content; */
    @Override // org.jdom2.Content
    public ProcessingInstruction detach() {
        return (ProcessingInstruction) super.detach();
    }

    /* JADX DEBUG: Method merged with bridge method: setParent(Lorg/jdom2/Parent;)Lorg/jdom2/Content; */
    @Override // org.jdom2.Content
    public ProcessingInstruction setParent(Parent parent) {
        return (ProcessingInstruction) super.setParent(parent);
    }
}
