package com.fasterxml.jackson.core;

import com.amplifyframework.core.model.ModelIdentifier;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.io.Serializable;
import o.AbstractC5503Ug;
import o.C5522Uy;

/* JADX INFO: loaded from: classes21.dex */
public class JsonPointer implements Serializable {
    protected static final JsonPointer EMPTY = new JsonPointer();
    public static final char SEPARATOR = '/';
    private static final long serialVersionUID = 1;
    protected final String _asString;
    protected final int _asStringOffset;
    protected int _hashCode;
    protected volatile JsonPointer _head;
    protected final int _matchingElementIndex;
    protected final String _matchingPropertyName;
    protected final JsonPointer _nextSegment;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static JsonPointer empty() {
        return EMPTY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getMatchingIndex() {
        return this._matchingElementIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getMatchingProperty() {
        return this._matchingPropertyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JsonPointer matchElement(int i) {
        if (i != this._matchingElementIndex || i < 0) {
            return null;
        }
        return this._nextSegment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean matches() {
        return this._nextSegment == null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean matchesElement(int i) {
        return i == this._matchingElementIndex && i >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean mayMatchElement() {
        return this._matchingElementIndex >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean mayMatchProperty() {
        return this._matchingPropertyName != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JsonPointer tail() {
        return this._nextSegment;
    }

    public JsonPointer() {
        this._nextSegment = null;
        this._matchingPropertyName = null;
        this._matchingElementIndex = -1;
        this._asString = "";
        this._asStringOffset = 0;
    }

    public JsonPointer(String str, int i, String str2, JsonPointer jsonPointer) {
        this._asString = str;
        this._asStringOffset = i;
        this._nextSegment = jsonPointer;
        this._matchingPropertyName = str2;
        this._matchingElementIndex = _parseIndex(str2);
    }

    public JsonPointer(String str, int i, String str2, int i2, JsonPointer jsonPointer) {
        this._asString = str;
        this._asStringOffset = i;
        this._nextSegment = jsonPointer;
        this._matchingPropertyName = str2;
        this._matchingElementIndex = i2;
    }

    public static JsonPointer compile(String str) throws IllegalArgumentException {
        if (str == null || str.length() == 0) {
            return EMPTY;
        }
        if (str.charAt(0) != '/') {
            throw new IllegalArgumentException("Invalid input: JSON Pointer expression must start with '/': \"" + str + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        }
        return _parseTail(str);
    }

    public static JsonPointer valueOf(String str) {
        return compile(str);
    }

    public static JsonPointer forPath(AbstractC5503Ug abstractC5503Ug, boolean z) {
        Application application;
        if (abstractC5503Ug == null) {
            return EMPTY;
        }
        if (!abstractC5503Ug.AYXKKw() && (!z || !abstractC5503Ug.isConnected() || !abstractC5503Ug.AhwBna())) {
            abstractC5503Ug = abstractC5503Ug.AEQbTJ();
        }
        int length = 0;
        Application application2 = null;
        while (abstractC5503Ug != null) {
            if (abstractC5503Ug.djBIcL()) {
                String strCopydefault = abstractC5503Ug.copydefault();
                if (strCopydefault == null) {
                    strCopydefault = "";
                }
                length += strCopydefault.length() + 2;
                application = new Application(application2, strCopydefault, -1);
            } else if (!abstractC5503Ug.valueOf() && !z) {
                abstractC5503Ug = abstractC5503Ug.AEQbTJ();
            } else {
                length += 6;
                application = new Application(application2, null, abstractC5503Ug.OLrzqt());
            }
            application2 = application;
            abstractC5503Ug = abstractC5503Ug.AEQbTJ();
        }
        if (application2 == null) {
            return EMPTY;
        }
        StringBuilder sb = new StringBuilder(length);
        Application application3 = null;
        Application application4 = application2;
        while (application4 != null) {
            application4.copydefault = sb.length();
            sb.append(SEPARATOR);
            String str = application4.EZpvd;
            if (str != null) {
                _appendEscaped(sb, str);
            } else {
                sb.append(application4.AEQbTJ);
            }
            Application application5 = application4;
            application4 = application4.OLrzqt;
            application3 = application5;
        }
        String string = sb.toString();
        JsonPointer jsonPointer = EMPTY;
        while (application3 != null) {
            String str2 = application3.EZpvd;
            if (str2 != null) {
                jsonPointer = new JsonPointer(string, application3.copydefault, str2, jsonPointer);
            } else {
                int i = application3.AEQbTJ;
                jsonPointer = new JsonPointer(string, application3.copydefault, String.valueOf(i), i, jsonPointer);
            }
            application3 = application3.KWHzl;
        }
        return jsonPointer;
    }

    private static void _appendEscaped(StringBuilder sb, String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '/') {
                sb.append("~1");
            } else if (cCharAt == '~') {
                sb.append("~0");
            } else {
                sb.append(cCharAt);
            }
        }
    }

    public int length() {
        return this._asString.length() - this._asStringOffset;
    }

    public JsonPointer last() {
        if (this == EMPTY) {
            return null;
        }
        JsonPointer jsonPointer = this;
        while (true) {
            JsonPointer jsonPointer2 = jsonPointer._nextSegment;
            if (jsonPointer2 == EMPTY) {
                return jsonPointer;
            }
            jsonPointer = jsonPointer2;
        }
    }

    public JsonPointer append(JsonPointer jsonPointer) {
        JsonPointer jsonPointer2 = EMPTY;
        if (this == jsonPointer2) {
            return jsonPointer;
        }
        if (jsonPointer == jsonPointer2) {
            return this;
        }
        String strSubstring = this._asString;
        if (strSubstring.endsWith("/")) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
        }
        return compile(strSubstring + jsonPointer._asString);
    }

    public JsonPointer appendProperty(String str) {
        if (str == null || str.isEmpty()) {
            return this;
        }
        if (str.charAt(0) != '/') {
            str = SEPARATOR + str;
        }
        String strSubstring = this._asString;
        if (strSubstring.endsWith("/")) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
        }
        return compile(strSubstring + str);
    }

    public JsonPointer appendIndex(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative index cannot be appended");
        }
        String strSubstring = this._asString;
        if (strSubstring.endsWith("/")) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
        }
        return compile(strSubstring + SEPARATOR + i);
    }

    public boolean matchesProperty(String str) {
        return this._nextSegment != null && this._matchingPropertyName.equals(str);
    }

    public JsonPointer matchProperty(String str) {
        if (this._nextSegment == null || !this._matchingPropertyName.equals(str)) {
            return null;
        }
        return this._nextSegment;
    }

    public JsonPointer head() {
        JsonPointer jsonPointer_constructHead = this._head;
        if (jsonPointer_constructHead == null) {
            if (this != EMPTY) {
                jsonPointer_constructHead = _constructHead();
            }
            this._head = jsonPointer_constructHead;
        }
        return jsonPointer_constructHead;
    }

    public String toString() {
        int i = this._asStringOffset;
        return i <= 0 ? this._asString : this._asString.substring(i);
    }

    public int hashCode() {
        int iHashCode = this._hashCode;
        if (iHashCode == 0) {
            iHashCode = toString().hashCode();
            if (iHashCode == 0) {
                iHashCode = -1;
            }
            this._hashCode = iHashCode;
        }
        return iHashCode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof JsonPointer)) {
            return false;
        }
        JsonPointer jsonPointer = (JsonPointer) obj;
        return _compare(this._asString, this._asStringOffset, jsonPointer._asString, jsonPointer._asStringOffset);
    }

    private final boolean _compare(String str, int i, String str2, int i2) {
        int length = str.length();
        if (length - i != str2.length() - i2) {
            return false;
        }
        while (i < length) {
            if (str.charAt(i) != str2.charAt(i2)) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    private static final int _parseIndex(String str) {
        int length = str.length();
        if (length == 0 || length > 10) {
            return -1;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt <= '0') {
            return (length == 1 && cCharAt == '0') ? 0 : -1;
        }
        if (cCharAt > '9') {
            return -1;
        }
        for (int i = 1; i < length; i++) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                return -1;
            }
        }
        if (length != 10 || C5522Uy.AYXKKw(str) <= 2147483647L) {
            return C5522Uy.EZpvd(str);
        }
        return -1;
    }

    public static JsonPointer _parseTail(String str) {
        int length = str.length();
        StateListAnimator stateListAnimator = null;
        int i = 1;
        int i2 = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '/') {
                StateListAnimator stateListAnimator2 = new StateListAnimator(stateListAnimator, i2, str.substring(i2 + 1, i));
                i2 = i;
                i++;
                stateListAnimator = stateListAnimator2;
            } else {
                i++;
                if (cCharAt == '~' && i < length) {
                    StringBuilder sb = new StringBuilder(32);
                    int i_extractEscapedSegment = _extractEscapedSegment(str, i2 + 1, i, sb);
                    String string = sb.toString();
                    if (i_extractEscapedSegment < 0) {
                        return _buildPath(str, i2, string, stateListAnimator);
                    }
                    StateListAnimator stateListAnimator3 = new StateListAnimator(stateListAnimator, i2, string);
                    i2 = i_extractEscapedSegment;
                    i = i_extractEscapedSegment + 1;
                    stateListAnimator = stateListAnimator3;
                }
            }
        }
        return _buildPath(str, i2, str.substring(i2 + 1), stateListAnimator);
    }

    private static JsonPointer _buildPath(String str, int i, String str2, StateListAnimator stateListAnimator) {
        JsonPointer jsonPointer = new JsonPointer(str, i, str2, EMPTY);
        while (stateListAnimator != null) {
            JsonPointer jsonPointer2 = new JsonPointer(str, stateListAnimator.EZpvd, stateListAnimator.AEQbTJ, jsonPointer);
            stateListAnimator = stateListAnimator.copydefault;
            jsonPointer = jsonPointer2;
        }
        return jsonPointer;
    }

    public static int _extractEscapedSegment(String str, int i, int i2, StringBuilder sb) {
        int length = str.length();
        int i3 = i2 - 1;
        if (i3 - i > 0) {
            sb.append((CharSequence) str, i, i3);
        }
        int i4 = i2 + 1;
        _appendEscape(sb, str.charAt(i2));
        while (i4 < length) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '/') {
                return i4;
            }
            int i5 = i4 + 1;
            if (cCharAt == '~' && i5 < length) {
                i4 += 2;
                _appendEscape(sb, str.charAt(i5));
            } else {
                sb.append(cCharAt);
                i4 = i5;
            }
        }
        return -1;
    }

    private static void _appendEscape(StringBuilder sb, char c) {
        if (c == '0') {
            c = '~';
        } else if (c == '1') {
            c = SEPARATOR;
        } else {
            sb.append('~');
        }
        sb.append(c);
    }

    public JsonPointer _constructHead() {
        JsonPointer jsonPointerLast = last();
        if (jsonPointerLast == this) {
            return EMPTY;
        }
        int length = jsonPointerLast.length();
        JsonPointer jsonPointer = this._nextSegment;
        String string = toString();
        return new JsonPointer(string.substring(0, string.length() - length), 0, this._matchingPropertyName, this._matchingElementIndex, jsonPointer._constructHead(length, jsonPointerLast));
    }

    public JsonPointer _constructHead(int i, JsonPointer jsonPointer) {
        if (this == jsonPointer) {
            return EMPTY;
        }
        JsonPointer jsonPointer2 = this._nextSegment;
        String string = toString();
        return new JsonPointer(string.substring(0, string.length() - i), 0, this._matchingPropertyName, this._matchingElementIndex, jsonPointer2._constructHead(i, jsonPointer));
    }

    public static class StateListAnimator {
        public final String AEQbTJ;
        public final int EZpvd;
        public final StateListAnimator copydefault;

        public StateListAnimator(StateListAnimator stateListAnimator, int i, String str) {
            this.copydefault = stateListAnimator;
            this.EZpvd = i;
            this.AEQbTJ = str;
        }
    }

    public static class Application {
        public final int AEQbTJ;
        public final String EZpvd;
        public Application KWHzl;
        public final Application OLrzqt;
        public int copydefault;

        public Application(Application application, String str, int i) {
            this.OLrzqt = application;
            this.EZpvd = str;
            this.AEQbTJ = i;
            if (application != null) {
                application.KWHzl = this;
            }
        }
    }

    private Object writeReplace() {
        return new Serialization(toString());
    }

    public static class Serialization implements Externalizable {
        private String _fullPath;

        public Serialization() {
        }

        public Serialization(String str) {
            this._fullPath = str;
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeUTF(this._fullPath);
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
            this._fullPath = objectInput.readUTF();
        }

        private Object readResolve() throws ObjectStreamException {
            return JsonPointer.compile(this._fullPath);
        }
    }
}
