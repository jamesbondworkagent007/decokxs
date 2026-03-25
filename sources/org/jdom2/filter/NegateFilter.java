package org.jdom2.filter;

/* JADX INFO: loaded from: classes24.dex */
final class NegateFilter extends AbstractFilter<Object> {
    private static final long serialVersionUID = 200;
    private final Filter<?> filter;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Filter<?> getBaseFilter() {
        return this.filter;
    }

    public NegateFilter(Filter<?> filter) {
        this.filter = filter;
    }

    @Override // org.jdom2.filter.Filter
    public Object filter(Object obj) {
        if (this.filter.matches(obj)) {
            return null;
        }
        return obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NegateFilter) {
            return this.filter.equals(((NegateFilter) obj).filter);
        }
        return false;
    }

    public int hashCode() {
        return ~this.filter.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("[NegateFilter: ");
        sb.append(this.filter.toString());
        sb.append("]");
        return sb.toString();
    }
}
