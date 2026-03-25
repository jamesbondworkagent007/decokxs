package org.jdom2.filter;

import org.jdom2.CDATA;
import org.jdom2.Comment;
import org.jdom2.Content;
import org.jdom2.DocType;
import org.jdom2.Element;
import org.jdom2.EntityRef;
import org.jdom2.ProcessingInstruction;
import org.jdom2.Text;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes24.dex */
public class ContentFilter extends AbstractFilter<Content> {
    public static final int CDATA = 2;
    public static final int COMMENT = 8;
    public static final int DOCTYPE = 128;
    public static final int DOCUMENT = 64;
    public static final int ELEMENT = 1;
    public static final int ENTITYREF = 32;
    public static final int PI = 16;
    public static final int TEXT = 4;
    private static final long serialVersionUID = 200;
    private int filterMask;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getFilterMask() {
        return this.filterMask;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.filterMask;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCDATAVisible(boolean z) {
        this.filterMask = z ? this.filterMask | 2 : this.filterMask & (-3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCommentVisible(boolean z) {
        this.filterMask = z ? this.filterMask | 8 : this.filterMask & (-9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDefaultMask() {
        this.filterMask = 255;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDocTypeVisible(boolean z) {
        this.filterMask = z ? this.filterMask | 128 : this.filterMask & (-129);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDocumentContent() {
        this.filterMask = CipherSuite.TLS_DHE_DSS_WITH_SEED_CBC_SHA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setElementContent() {
        this.filterMask = 63;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setElementVisible(boolean z) {
        this.filterMask = z ? this.filterMask | 1 : this.filterMask & (-2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setEntityRefVisible(boolean z) {
        this.filterMask = z ? this.filterMask | 32 : this.filterMask & (-33);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPIVisible(boolean z) {
        this.filterMask = z ? this.filterMask | 16 : this.filterMask & (-17);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTextVisible(boolean z) {
        this.filterMask = z ? this.filterMask | 4 : this.filterMask & (-5);
    }

    public ContentFilter() {
        setDefaultMask();
    }

    public ContentFilter(boolean z) {
        if (z) {
            setDefaultMask();
        } else {
            int i = this.filterMask;
            this.filterMask = i & (~i);
        }
    }

    public ContentFilter(int i) {
        setFilterMask(i);
    }

    public void setFilterMask(int i) {
        setDefaultMask();
        this.filterMask = i & this.filterMask;
    }

    /* JADX DEBUG: Method merged with bridge method: filter(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // org.jdom2.filter.Filter
    public Content filter(Object obj) {
        if (obj == null || !Content.class.isInstance(obj)) {
            return null;
        }
        Content content = (Content) obj;
        if (content instanceof Element) {
            if ((this.filterMask & 1) != 0) {
                return content;
            }
            return null;
        }
        if (content instanceof CDATA) {
            if ((this.filterMask & 2) != 0) {
                return content;
            }
            return null;
        }
        if (content instanceof Text) {
            if ((this.filterMask & 4) != 0) {
                return content;
            }
            return null;
        }
        if (content instanceof Comment) {
            if ((this.filterMask & 8) != 0) {
                return content;
            }
            return null;
        }
        if (content instanceof ProcessingInstruction) {
            if ((this.filterMask & 16) != 0) {
                return content;
            }
            return null;
        }
        if (content instanceof EntityRef) {
            if ((this.filterMask & 32) != 0) {
                return content;
            }
            return null;
        }
        if (!(content instanceof DocType) || (this.filterMask & 128) == 0) {
            return null;
        }
        return content;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContentFilter) && this.filterMask == ((ContentFilter) obj).filterMask;
    }
}
