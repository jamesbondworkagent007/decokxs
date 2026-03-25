package org.apache.httpcore;

import com.fasterxml.jackson.core.JsonPointer;
import java.io.Serializable;
import o.C59825zoO;

/* JADX INFO: loaded from: classes24.dex */
public class ProtocolVersion implements Serializable, Cloneable {
    private static final long serialVersionUID = 8950662842175091068L;
    protected final int major;
    protected final int minor;
    protected final String protocol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMajor() {
        return this.major;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMinor() {
        return this.minor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProtocol() {
        return this.protocol;
    }

    public ProtocolVersion(String str, int i, int i2) {
        this.protocol = (String) C59825zoO.copydefault(str, "Protocol name");
        this.major = C59825zoO.AEQbTJ(i, "Protocol minor version");
        this.minor = C59825zoO.AEQbTJ(i2, "Protocol minor version");
    }

    public ProtocolVersion forVersion(int i, int i2) {
        return (i == this.major && i2 == this.minor) ? this : new ProtocolVersion(this.protocol, i, i2);
    }

    public final int hashCode() {
        return (this.protocol.hashCode() ^ (this.major * 100000)) ^ this.minor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtocolVersion)) {
            return false;
        }
        ProtocolVersion protocolVersion = (ProtocolVersion) obj;
        return this.protocol.equals(protocolVersion.protocol) && this.major == protocolVersion.major && this.minor == protocolVersion.minor;
    }

    public boolean isComparable(ProtocolVersion protocolVersion) {
        return protocolVersion != null && this.protocol.equals(protocolVersion.protocol);
    }

    public int compareToVersion(ProtocolVersion protocolVersion) {
        C59825zoO.copydefault(protocolVersion, "Protocol version");
        C59825zoO.copydefault(this.protocol.equals(protocolVersion.protocol), "Versions for different protocols cannot be compared: %s %s", this, protocolVersion);
        int major = getMajor() - protocolVersion.getMajor();
        return major == 0 ? getMinor() - protocolVersion.getMinor() : major;
    }

    public final boolean greaterEquals(ProtocolVersion protocolVersion) {
        return isComparable(protocolVersion) && compareToVersion(protocolVersion) >= 0;
    }

    public final boolean lessEquals(ProtocolVersion protocolVersion) {
        return isComparable(protocolVersion) && compareToVersion(protocolVersion) <= 0;
    }

    public String toString() {
        return this.protocol + JsonPointer.SEPARATOR + Integer.toString(this.major) + '.' + Integer.toString(this.minor);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
